def maxValue(arr):
    maximum = arr[0]

    for i in arr:
        if i > maximum:
            maximum = i

    return maximum


l = [1, 2, 30, 4, 50, 6, 7, 8, 90, 10]
maxi = maxValue(l)

print(f"Maximum value in {l} is {maxi}")
