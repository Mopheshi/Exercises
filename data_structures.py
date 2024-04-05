import math


def print_even(n):
    """
    Function to print all the even numbers between one and a given number n
    :param n:
    """
    for n in range(2, n):
        if n % 2 == 0:
            print(n)


def factorial(n):
    """
    Function to find the factorial of a given number n
    :param n:
    :return factorial:
    """
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)


def num_check(n):
    """
    Function that takes an integer as input and returns "Positive" if the number is greater than zero, "Negative" if
    it's less than zero, and "Zero" if it's equal to zero.
    Param n:
    """
    if n > 0:
        return 'Positive'
    elif n == 0:
        return 'Zero'
    elif n < 0:
        return 'Negative'


def is_leap_year(year):
    """
    Function to determine if a given year is a leap year or not.
    :param year:
    :return:
    """
    if year % 4 == 0 and (year % 100 != 0 or year % 400 == 0):
        return f'{year} is a leap year...'
    else:
        return f'{year} is not a leap year'


def circle_area(radius):
    """
    Function to calculate the area of a circle given the radius.
    :param radius:
    :return area:
    """
    # pi = 3.141592653589793
    # pi = 3.1428571428571428571428571428571
    # pi = 3.14159
    # pi = 22 / 7
    pi = math.pi
    area = pi * (radius ** 2)
    return f'Area of a circle with radius {radius} is {area}'


def is_palindrome(string):
    """
    Function to check if a given word is a palindrome.
    :param string:
    :return:
    """
    string = string.lower()
    return string == string[::-1]


def remove_duplicates(lst):
    """
    Function to remove duplicates from a list.
    :param lst:
    :return new_list:
    """
    # return list(set(lst))

    # for i in lst:
    #     if lst.count(i) > 1:
    #         lst.remove(i)
    # return lst

    # for i in lst:
    #     while lst.count(i) > 1:
    #         lst.remove(i)
    # return lst

    new_list = list()
    for i in lst:
        if i not in new_list:
            new_list.append(i)
    return new_list


def city_population(cities):
    """
    Function to find the city with the highest population in the dictionary.
    :param cities:
    :return city:
    """
    city = ''
    population = 0
    for c in cities:
        if population < cities[c]:
            population = cities[c]
            city = c
    return f'{city} has the highest population of {cities[city]}'


def prime_set(n):
    """
    Function to check if a given number is prime and add it to a set.
    :param n:
    :return:
    """
    prime_nums = set()
    for num in range(2, n + 1):
        if all(num % i != 0 for i in range(2, num)):
            prime_nums.add(num)
    return prime_nums


def even_set(n):
    """
    Function to add even numbers to a set.
    :param n:
    :return:
    """
    even_nums = set()
    for num in range(1, n):
        if num % 2 == 0:
            even_nums.add(num)
    return even_nums


def set_intersection(set1, set2):
    """
    Function to find the intersection of two sets.
    :param set1:
    :param set2:
    :return:
    """
    u = set()
    n = set()

    for i in set1:
        if i in set2:
            n.add(i)
        u.add(i)
    for i in set2:
        if i not in u:
            u.add(i)
    return u, n


print_even(20)
print(factorial(5))
print(num_check(-12))
print(is_leap_year(1999))
print(circle_area(5))
print(is_palindrome('Madam'))
print(remove_duplicates([0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]))

city_names = {'London': 9000000, 'Paris': 2200000, 'Tokyo': 14000000}
print(city_population(city_names))

primes = prime_set(10)
evens = even_set(10)
union, intersection = set_intersection(primes, evens)
print(f'Union of {primes} and {evens} = {union}\n'
      f'Intersection between {primes} and {evens} = {intersection}')
