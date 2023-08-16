# import random
#
# quotes = [
#     "Believe you can and you're halfway there.",
#     "The future belongs to those who believe in the beauty of their dreams.",
#     "The only way to do great work is to love what you do.",
#     "In the middle of every difficulty lies opportunity.",
#     "Success is not final, failure is not fatal: It is the courage to continue that counts."
# ]
#
#
# def generate_quote():
#     return random.choice(quotes)
#
#
# print(generate_quote())

def init_board():
    return [[' ' for _ in range(3)] for _ in range(3)]  # Creates an empty 3x3 board


# Display the board
def display_board(board):
    for row in board:
        print('|'.join(row))
        print('-' * 5)


# Check for a draw
def check_draw(board):
    return all(cell != ' ' for row in board for cell in row)


# Check for a win
def check_win(board, player):
    for row in board:
        if all(cell == player for cell in row):
            return True  # Checks if a player has won by completing a row
    for col in range(3):
        if all(row[col] == player for row in board):
            return True  # Checks if a player has won by completing a column
    if all(board[i][i] == player for i in range(3)) or all(board[i][2 - i] == player for i in range(3)):
        return True  # Checks if a player has won by completing a diagonal


# Minimax Algorithm
def minimax(board, depth, is_maximizing):
    if check_win(board, 'X'):
        return -1  # Returns a negative score if 'X' wins
    if check_win(board, 'O'):
        return 1  # Returns a positive score if 'O' wins
    if check_draw(board):
        return 0  # Returns 0 for a draw

    if is_maximizing:
        max_eval = -float('inf')  # Initialize the maximum evaluation score
        for row in range(3):
            for col in range(3):
                if board[row][col] == ' ':
                    board[row][col] = 'O'
                    eval = minimax(board, depth + 1, False)
                    board[row][col] = ' '
                    max_eval = max(max_eval, eval)  # Update maximum evaluation score
        return max_eval
    else:
        min_eval = float('inf')  # Initialize the minimum evaluation score
        for row in range(3):
            for col in range(3):
                if board[row][col] == ' ':
                    board[row][col] = 'X'
                    eval = minimax(board, depth + 1, True)
                    board[row][col] = ' '
                    min_eval = min(min_eval, eval)  # Update minimum evaluation score
        return min_eval


# Find the best move using Minimax
def find_best_move(board):
    best_move = None
    best_eval = -float('inf')  # Initialize the best evaluation score
    for row in range(3):
        for col in range(3):
            if board[row][col] == ' ':
                board[row][col] = 'O'
                eval = minimax(board, 0, False)
                board[row][col] = ' '
                if eval > best_eval:
                    best_eval = eval
                    best_move = (row, col)  # Update the best move
    return best_move


# Main game loop
def main():
    board = init_board()
    player_turn = True

    while not (check_win(board, 'X') or check_win(board, 'O') or check_draw(board)):
        display_board(board)

        if player_turn:
            row, col = map(int, input("Enter row and column (0-2) separated by a space: ").split())
            if board[row][col] == ' ':
                board[row][col] = 'X'
                player_turn = False
            else:
                print("Cell already taken. Try again.")
        else:
            print("AI is thinking...")
            row, col = find_best_move(board)
            board[row][col] = 'O'
            player_turn = True

    display_board(board)

    if check_win(board, 'X'):
        print("You win!")
    elif check_win(board, 'O'):
        print("AI wins!")
    else:
        print("It's a draw!")


# Start the game
if __name__ == "__main__":
    main()
