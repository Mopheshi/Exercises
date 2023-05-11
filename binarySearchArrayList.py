import bisect

# with open('Files/english.txt', 'r') as f:
#     lines = f.readlines()
#     lines = [line.strip() for line in lines]
#     lines.sort()
#
# print(lines)

with open('Files/english.txt', encoding='utf-8') as file:
    l = [line.strip() for line in file]

l = sorted(l)
print(l)

item = input("What do you want to search? ")
index = bisect.bisect_left(l, item)

print(f"{item} exists at index {index}")
