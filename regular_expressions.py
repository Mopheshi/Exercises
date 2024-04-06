import re


def match_email(file):
    """
    Function to extract all emails from a text file
    :param file:
    :return list of emails:
    """
    with open(file, 'r') as f:
        emails = list()
        for line in f:
            # matches = re.findall(r'\b[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}\b', line)
            # matches = re.findall(r'\b[\w._%+-]+@[\w.-]+\.[a-zA-Z]{2,}\b', line)
            match = re.findall(r'\b[\w._%+-]+@[\w.-]+\.\w{2,}\b', line)
            emails.extend(match)
    f.close()
    return emails, len(emails)


def match_phone(file):
    """
    Function to extract all phone numbers (including international phone numbers) from a text file
    :param file:
    :return list of phone numbers:
    """
    with open(file, 'r') as f:
        phones = list()
        for line in f:
            match = re.findall(r'\b(?:\+\d{1,3}[-.\s]?)?\(?\d{3}\)?[-.\s]?\d{3}[-.\s]?\d{4}\b', line)
            phones.extend(match)
    f.close()
    return phones, len(phones)

# Text Manipulation:
# a. Create a Python function that uses regular expressions to replace all occurrences of a
# specific word in a text with another word.
# b. Write a script to extract all URLs from a web page HTML using regular expressions.


print(match_email('files/mbox.txt'), '\n\n')
print(match_phone('files/mbox.txt'))
