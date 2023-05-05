# These string matching algorithms can be used in combination with other Python libraries such as re (Regular
# expression operations) or difflib (Helpers for computing deltas (edit diffs) between objects.) based on specific
# requirements.

"""
@Chatbot AI
@Mopheshi
"""

"""
Naive Algorithm: The naive algorithm is the simplest algorithm for string matching in Python. It works by comparing 
the pattern with each substring of the text. It has a time complexity of O(m * n), where m is the length of the 
pattern and n is the length of the text.
"""


def naive_search(text, pattern):
    n = len(text)
    m = len(pattern)
    positions = []
    for i in range(n - m + 1):
        match = True
        for j in range(m):
            if text[i + j] != pattern[j]:
                match = False
                break
        if match:
            positions.append(i)
    return positions


"""
Knuth - Morris - Pratt Algorithm: The Knuth - Morris - Pratt algorithm is a more efficient algorithm for string 
matching in Python. It uses a failure function to skip over unnecessary comparisons.The failure function stores the 
length of the longest proper prefix of the pattern which is also a suffix of the pattern. This algorithm has a time 
complexity of O(n+m), where n is the length of the text and m is the length of the pattern.
"""


def kmp_search(text, pattern):
    n = len(text)
    m = len(pattern)

    # Compute failure function
    failure = [0] * m
    j = 0
    for i in range(1, m):
        while j > 0 and pattern[j] != pattern[i]:
            j = failure[j - 1]
        if pattern[j] == pattern[i]:
            j += 1
        failure[i] = j

    # Search for pattern
    positions = []
    j = 0
    for i in range(n):
        while j > 0 and pattern[j] != text[i]:
            j = failure[j - 1]
        if pattern[j] == text[i]:
            j += 1
        if j == m:
            positions.append(i - m + 1)
            j = failure[j - 1]
    return positions


"""
Boyer - Moore Algorithm: The Boyer - Moore algorithm is another efficient algorithm for string matching in 
Python. It uses two heuristics to skip over unnecessary comparisons - the bad character rule and the good suffix 
rule. This algorithm has a time complexity of O(n+m), where n is the length of the text and m is the length of the 
pattern.
"""


def bm_search(text, pattern):
    n = len(text)
    m = len(pattern)

    # Preprocessing
    skip = [m] * 256
    for i in range(m - 1):
        skip[ord(pattern[i])] = m - i - 1

    # Search for pattern
    i = m - 1
    positions = []
    while i < n:
        j = m - 1
        while text[i] == pattern[j]:
            if j == 0:
                positions.append(i)
                break
            i -= 1
            j -= 1
        i += max(skip[ord(text[i])], m - j)
    return positions


"""
Rabin - Karp Algorithm: The Rabin - Karp algorithm is a probabilistic algorithm for string matching in Python. It 
uses a hash function to check for possible matches between the pattern and substrings of the text. This algorithm has 
a time complexity of O(n+m), where n is the length of the text and m is the length of the pattern.
"""


def rabin_karp_search(text, pattern):
    n = len(text)
    m = len(pattern)
    positions = []

    # Hash function
    p = 31
    p_pow = [1] * n
    for i in range(1, n):
        p_pow[i] = p_pow[i - 1] * p

    h_pattern = 0
    for i in range(m):
        h_pattern += ord(pattern[i]) * p_pow[m - i - 1]

    h_ascii = [ord(c) for c in text]
    h_text = [0] * (n - m + 1)
    h_text[0] = sum([h_ascii[i] * p_pow[m - i - 1] for i in range(m)])
    for i in range(1, n - m + 1):
        h_text[i] = (h_ascii[i + m - 1] + h_text[i - 1] * p - h_ascii[i - 1] * p_pow[m]) % (10 ** 9 + 7)
        if h_text[i] == h_pattern:
            positions.append(i)

    return positions


# Test the functions...
if __name__ == "__main__":
    print(naive_search("Morpheus Softwares", 'e'))
    print(kmp_search("Morpheus Softwares", 'e'))
    print(bm_search("Morpheus Softwares", 'e'))
    print(rabin_karp_search("Morpheus Softwares", 'e'))
