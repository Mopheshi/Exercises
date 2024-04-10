import re

# import nltk
import requests
from nltk.corpus import twitter_samples

# Download the twitter sample dataset first if not already downloaded
# nltk.download('twitter_samples')

all_positive_tweets = twitter_samples.strings('positive_tweets.json')
all_negative_tweets = twitter_samples.strings('negative_tweets.json')

tweets = all_positive_tweets + all_negative_tweets  # Concatenate the lists.


def extract(file, parameter):
    """
    Function to extract all emails, phone numbers, dates or urls from a text file
    :param file: path or web url
    :param parameter: email, phone, date or url
    :return list of emails, phone numbers of urls
    """
    emails = list()
    phones = list()
    dates = list()

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
    elif parameter == 'date':
        with open(file, 'r') as f:
            for line in f:
                match1 = re.findall(r'^\d{2}\d{2}/\d{4}$', line)
                match2 = re.findall(r'^\d{4} \d{2} \d{2}$', line)
                match3 = re.findall(r'\b(?:Mon|Tue|Wed|Thu|Fri|Sat|Sun),\s\d{1,2}\s(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|'
                                    r'Sep|Oct|Nov|Dec)\s\d{4}\b', line)
                dates.extend(match1)
                dates.extend(match2)
                dates.extend(match3)
            f.close()
            return dates, len(dates)
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
        if old_word in text:
            text = re.sub(rf'\b{re.escape(old_word)}\b', new_word, text)
        else:
            text = f'{old_word} not found in the file provided...'
        f.close()
        return text


def extract_characters_from_tweets(posts, char):
    """
    Function to extract all characters from a tweet
    :param posts: The tweets to extract characters from
    :param char: The character to extract from tweets, e.g. '#', '@'
    :return list of characters in the tweets
    """
    chars = list()
    for tweet in posts:
        c = re.findall(rf'{char}\w+', tweet)
        chars.extend(c)
    return chars, f'Number of {char} = {len(chars)}', f'Number of tweets = {len(posts)}'


def validate_password(password):
    """
    Function to validate a password of at least 6 characters, at least one upper & lowercase letters, one special
    character and one digit.
    :param password: to be checked for validation
    :return True: if the password meets the validation criteria
    """
    if re.fullmatch(r'^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*.#()+-=?&]).{6,}$', password):
        return True
    return False


def extract_word_number(text):
    """
    Function to extract to a list, all mentions of a specific word followed by a number like abc123, xyz02, etc.
    :param text: the text to search for the word followed by a number in
    :return list of word followed by a number
    """
    return re.findall(r'\b\w+\d+\b', text)


print(extract('files/mbox.txt', 'email'), '\n\n')
print(extract('files/mbox.txt', 'phone'), '\n\n')
print(extract('files/mbox.txt', 'date'), '\n\n')
print(extract('https://www.scholarships.sk/', 'url'), '\n\n')

print(replace_word('Received', 'Mophe', 'files/mbox.txt'))

print(extract_characters_from_tweets(tweets, '@'), '\n\n')
print(extract_characters_from_tweets(tweets, '#'))

print(validate_password('a1Hdj*skd'))

text = '''
    The meeting is scheduled for 2pm tomorrow.
    # Advanced Matching:
    a. Write a regular expression to extract all mentions of a specific word followed by a number (
    e.g., "product123", Atachiz02 Softwares, and etc1...) from a text. r'[a-zA-Z]+\d+'
    '''
print(extract_word_number(text))
