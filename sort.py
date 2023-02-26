li = [12, 45, 234, 75, 2, 43]
iterator = 0
temporaryInteger = 0;

print("Unsorted list =", li)

for i in range(iterator, len(li)):
    for j in range(i + 1, len(li)):
        if (li[i] > li[j]):
            temporaryInteger = li[i]
            li[i] = li[j]
            li[j] = temporaryInteger

print("Sorted list =", li)
