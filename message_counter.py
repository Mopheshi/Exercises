import pandas as pd
import numpy as np
import re
import dateparser
from collections import Counter
import matplotlib.pyplot as plt

plt.style.use('ggplot')


def read_file(file):
    """
    Read whatsapp text file into a list of strings
    @AndrewNPopC
    """

    x = open(file, 'r', encoding='utf-8')  # Opens the text file into variable x but the variable cannot be explored yet
    y = x.read()  # By now it becomes a huge chunk of string that we need to separate line by line
    content = y.splitlines()  # The splitline method converts the chunk of string into a list of strings
    return content


# chat = read_file('chat.txt')
chat = read_file('Files/chat.txt')
len(chat)

join = [line for line in chat if "joined using this" in line]
# join

# Remove new lines
chat = [line.strip() for line in chat]
print(f"length of chat is: {len(chat)}")
# print(len(chat))

# Clean out the join notification lines
clean_chat = [line for line in chat if not "joined using this" in line]

# Further cleaning
# Remove empty lines
clean_chat = [line for line in clean_chat if len(line) > 1]
print(f"length of clean_chat is: {len(clean_chat)}")
# print(len(clean_chat))

left = [line for line in clean_chat if line.endswith("left")]
# left

# Clean out the left notification lines
clean_chat = [line for line in clean_chat if not line.endswith("left")]
print(f"length of clean_chat is: {len(clean_chat)}")
# print(len(clean_chat))

# Clean out the left notification lines
import re

# with open('C:\\Users\\eliteBOOK revolve\\Desktop\\chat.txt', encoding='utf-8') as clean_chat:
with open('Files/chat.txt', encoding='utf-8') as clean_chat:
    clean_chat = [line for line in clean_chat if not line.endswith("left")]

    print(f"Length of clean_chat is {len(clean_chat)}")
# len(clean_chat)

'''Next, we will group all the lines in clean_chat into messages and store in a variable named msgs. 
Every message begins with a date e.g 12/12/19 and we will use this property in grouping.
We will make use of the regex package in Python by running the code below:'''

# Merge messages that belong together
msgs = []  # message container
pos = 0  # counter for position of msgs in the container
"""
Flow:
For every line, see if it matches the expression which is starting with the format "number(s)+slash" eg "12/"
If it does, it is a new line of conversion as they begin with dates, add it to msgs container
Else, it is a continuation of the previous line, add it to the previous line and append to msgs, then pop previous line.
"""

for line in clean_chat:
    if re.findall("\A\d+[/]", line):
        msgs.append(line)
        pos += 1
    else:
        if 0 < pos <= len(msgs):
            take = msgs[pos - 1] + ". " + line
            msgs.append(take)
            msgs.pop(pos - 1)

print(f"Length of msgs is {len(msgs)}")
# len(msgs)