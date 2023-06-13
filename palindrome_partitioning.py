"""
To implement this function using dynamic programming, we can first create a boolean table 'is_palindrome' where
'is_palindrome[i][j]=True' if the substring 's[i:j+1]' is a palindrome, and 'False' otherwise. We can use this table
to check whether a substring is a palindrome in constant time.

Then, we can use another dynamic programming table 'partition' to store the results. 'partition[i]' will be a list of
all possible palindrome partitions of 's[:i+1]'. We can construct this table by iterating through all possible
partition lengths, and checking if the substring preceding the partition is a palindrome. If it is, we can add that
substring and the partition to the 'partition' table for the current index.
"""


def partition_palindrome(s):
    n = len(s)
    is_palindrome = [[False] * n for _ in range(n)]
    partition = [[] for _ in range(n)]

    for i in range(n):
        is_palindrome[i][i] = True
        partition[i].append([s[i]])

    for length in range(2, n + 1):
        for i in range(n - length + 1):
            j = i + length - 1
            if length == 2:
                is_palindrome[i][j] = s[i] == s[j]
            else:
                is_palindrome[i][j] = s[i] == s[j] and is_palindrome[i + 1][j - 1]

            if is_palindrome[i][j]:
                curr_sub = [s[i:j + 1]]
                prev_parts = partition[i - 1] if i > 0 else [[]]
                for prev_part in prev_parts:
                    partition[i + j].append(prev_part + curr_sub)

    return partition[-1]


"""
We start by initializing the 'is_palindrome' and 'partition' tables as described above. Then, we iterate through 
all possible lengths (2 through 'n' inclusive) and all possible starting indices for a substring of that length. For 
each substring, we use the 'is_palindrome' table to check if it's a palindrome, and if so, we add it to all possible 
partitions of the substring preceding it.

Finally, we return the list of all possible partitions of the full string, which is stored in 'partition[-1]'.
"""

print(partition_palindrome('aab'))
print(partition_palindrome('racecar'))

word = input('Type a string to partition...\n')

print(partition_palindrome(word))
