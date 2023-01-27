file = open('mop.txt', 'w')
l1 = file.write("This is line one...")
l2 = file.write("\nThis is line two...")
x = 23
l3 = file.write(f"\nThis is line three with an integer {'%d' % x}.")
# l3 = file.write(f"\nThis is line three with an integer {str(x)}.")
file.close()
