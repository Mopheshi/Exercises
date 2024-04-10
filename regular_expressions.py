import re

import requests


def extract(file, parameter):
    """
    Function to extract all emails or phone numbers from a text file
    :param file: path or web url
    :param parameter: email, phone or url
    :return list of emails, phone numbers of urls
    """
    emails = list()
    phones = list()

    if parameter == 'email':
        with open(file, 'r') as f:
            for line in f:
                # matches = re.findall(r'\b[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}\b', line)
                # matches = re.findall(r'\b[\w._%+-]+@[\w.-]+\.[a-zA-Z]{2,}\b', line)
                match = re.findall(r'\b[\w._%+-]+@[\w.-]+\.\w{2,}\b', line)
                emails.extend(match)
            f.close()
            return emails, len(emails)
    elif parameter == 'phone':
        with open(file, 'r') as f:
            for line in f:
                match = re.findall(r'\b(?:\+\d{1,3}[-.\s]?)?\(?\d{3}\)?[-.\s]?\d{3}[-.\s]?\d{4}\b', line)
                phones.extend(match)
            f.close()
            return phones, len(phones)
    elif parameter == 'url':
        response = requests.get(file)
        if response.status_code == 200:
            url_pattern = re.compile(
                r'http[s]?://(?:[a-zA-Z]|[0-9]|[$-_@.&+]|[!*\\(\\),]|(?:%[0-9a-fA-F][0-9a-fA-F]))+')
            urls = re.findall(url_pattern, response.text)
            return urls, len(urls)
        return f'Failed to retrieve the web page. Status code: {response.status_code}'
    return 'Invalid parameter'


def replace_word(old_word, new_word, file):
    """
    Function to replace a word with another in a text file
    :param old_word: The word to replace
    :param new_word: The replacement word
    :param file: Path to the text file
    """
    with open(file, 'r') as f:
        text = f.read()
        text = re.sub(rf'\b{re.escape(old_word)}\b', new_word, text)
        print(text)
        f.close()


# print(extract('files/mbox.txt', 'email'), '\n\n')
# print(extract('files/mbox.txt', 'phone'), '\n\n')
# print(extract('https://www.scholarships.sk/', 'url'), '\n\n')

replace_word('Received', 'Mophe', 'files/mbox.txt')
