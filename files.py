import os

file = open('mop.txt', 'w')
l1 = file.write("This is line one...")
l2 = file.write("\nThis is line two...")
x = 23
l3 = file.write(f"\nThis is line three with an integer {'%d' % x}.")
# l3 = file.write(f"\nThis is line three with an integer {str(x)}.")
file.close()

# Get current working directory
# cwd = os.getcwd()
# print(cwd)

# Get absolute path
# path = os.path.abspath('mop.txt')

# Check if a path exists
# path = os.path.exists('mop.txt')
# print(path)

# Check if it's a directory
# path = os.path.isdir('C:/Users/NPC-ICT/PycharmProjects/Exercises')
# print(path)

# Check if it's a file
# path = os.path.isfile('mop.txt')
# print(path)

# Returns a arr with files/other directories contained in the specified directory
p = os.listdir('C:/Users/MOPHE/PycharmProjects/Exercises')
print(p)
