# Author: Shreyash
# Modified: Mopheshi

def compressString(s):
    compressed = ""
    count = 1
    for i in range(1, len(s)):
        if s[i - 1] == s[i]:
            count += 1
        else:
            # compressed += s[i - 1] + str(count)
            compressed += s[i - 1]

            if count > 1:
                compressed += ("{0} ".format(str(count)))

            count = 1
    # compressed += s[-1] + str(count)
    compressed += s[-1]
    # return compressed if len(compressed) < len(s) else s
    if count > 1:
        compressed += str(count)
    return compressed


print(compressString("NNdddaaaaccccchhhhhhiiiiiiimmmmmmmmyyyyyyyyyaaaaaaaaaa"))
