iterator = 0
temporaryInteger = 0

# You can use this to get user inputs
# print("Type in 3 integer values, abeg: ")
# for i in range(0, 3):
#     integer = int(input())
#     li.append(integer)

# Getting user inputs
li = [int(integer) for integer in input("Enter the 3 integers separated with a single space ' ', biko...: ").split()]

print("Unsorted list =", li)

for i in range(iterator, len(li)):
    for j in range(i + 1, len(li)):
        if (li[i] > li[j]):
            temporaryInteger = li[i]
            li[i] = li[j]
            li[j] = temporaryInteger

print("Sorted list =", li, "\nSmallest =", li[0], "\nMedium =", li[1], "\nHighest =", li[2])
