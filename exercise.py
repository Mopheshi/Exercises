def multiplication_table(integer):
    # using for loop
    for i in range(0, 10):  # start from 0 to 9, you can increase the range though...
        answer = i * integer
        print(f"{integer} * {i} = {answer}")

    return


def multiply_table(integer):
    # using while loop
    i = 0

    while i < 10:  # start from 0 to 9, you can increase the range though...
        answer = i * integer
        print(f"{integer} * {i} = {answer}")

        i += 1  # increment by 1

    return


def string_counter(word):
    num = 0

    for _ in word:  # iterate over all the characters '_' in the given word
        num += 1  # increment the value of num by 1 for every character present in the word

    return num


def even_odd(numbers):  # 'numbers' is a list in Python or array in Java
    even = 0  # initialize initial values of even and odd numbers to 0
    odd = 0

    for i in numbers:  # iterate over integers in list of numbers
        if i % 2 == 0:  # if the current integer is divisible by 2
            even += 1  # then increment the 'even' by 1
        else:
            odd += 1  # otherwise increment 'odd' by 1

    return even, odd  # return the cumulative values of even and odd numbers


def remove_duplicates(numbers):  # 'numbers' is a list in Python or array in Java
    new_list = []  # create an empty 'new_list'

    for i in numbers:  # iterate over integers in list of numbers
        if i not in new_list:  # check if the current value of 'i' is already in the 'new_list'
            new_list.append(i)  # add the value of the integer that's not in the 'new_list' to the 'new_list'

    return new_list  # return the 'new_list'


def is_ascending(numbers):  # 'numbers' is a list in Python or array in Java
    isAscending = True  # initialize a boolean variable to False at start

    for i in range(len(numbers) - 1):  # iterate over numbers in the list minus the last element to avoid exceptions
        if numbers[i] > numbers[i + 1]:  # if the current number in the list is greater than the next number in the list
            isAscending = False  # change the boolean value of 'isAscending' to False

    return isAscending  # otherwise return True which is the original value of 'isAscending'


def is_abecedarian(word):  # 'word' is a string of characters to be gotten from the user
    initialCharacter = word[0]  # initialize the first character to 'initialCharacter'

    for character in word:  # iterate over all the characters in the 'word'
        if character < initialCharacter:  # return False if the current character is less than the 'initialCharacter'
            return False

        # assign the current character to 'initialCharacter' and repeat the process
        # until all the characters are iterated over
        initialCharacter = character

    return True


if __name__ == "__main__":
    # number = int(input("Type a number: "))  # convert entry to integer
    # print(multiplication_table(number))
    # print()
    # print(multiply_table(number))

    # print()

    # string = input("Type a word or sentence: ")
    # print(f"{string} has {string_counter(string)} letters!\n")

    # request integer values from the user
    string = input("Enter your array of integers separated by commas ',': ")
    arr = [int(i) for i in string.split(",")]  # convert user input to list/array of integers

    # get the returned values of even and odd numbers and assign them in order
    # even_number, odd_number = even_odd(arr)
    #
    # print(f"\nEven numbers = {even_number}\nOdd numbers = {odd_number}\n")
    #
    # print(f"Old array = {arr}\nCleaned array = {remove_duplicates(arr)}")

    print(is_ascending(arr))

    # request string values from the user and convert them to lowercase
    string = input("Enter a word: ").lower()
    print(is_abecedarian(string))
