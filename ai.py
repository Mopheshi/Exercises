import random

# List of inspirational words
inspirational_words = [
    "believe", "dream", "achieve", "success",
    "perseverance", "passion", "opportunity",
    "motivation", "hope", "goals", "growth"
]

# List of positive adjectives
positive_adjectives = [
    "amazing", "wonderful", "inspiring", "uplifting",
    "empowering", "remarkable", "excellent", "encouraging"
]


# Generate a random inspirational quote
def generate_quote():
    word1 = random.choice(inspirational_words)
    word2 = random.choice(inspirational_words)
    adj = random.choice(positive_adjectives)
    return f"Believe in the {adj} power of {word1} and {word2}."


# Main function
# def main():
#     quote = generate_quote()
#     print(quote)


def generate_character_patterns():
    patterns = {
        'A': [
            "  *  ",
            " * * ",
            "*   *",
            "*****",
            "*   *"
        ],
        'B': [
            "**** ",
            "*   *",
            "**** ",
            "*   *",
            "**** "
        ],
        # Add more patterns for other characters here
    }
    return patterns


def print_character_pattern(char, patterns):
    if char in patterns:
        for line in patterns[char]:
            print(line)
    else:
        print("Pattern not available for this character.")


# Main function
def main():
    patterns = generate_character_patterns()
    input_char = input("Enter a character (A-Z): ").upper()
    print_character_pattern(input_char, patterns)


if __name__ == "__main__":
    main()
