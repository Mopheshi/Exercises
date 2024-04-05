from sw import stop_words
import nltk


# import os
# Below is an example of how to set proxy for nltk.download() if you are behind a proxy server.
# os.environ['http_proxy'] = 'http://proxy.example.com:8080'
# os.environ['https_proxy'] = 'http://proxy.example.com:8080'

# nltk.download('punkt') # Download the Punkt Tokenizer Models


def word_frequency_file(file):
    """
    Function to count the frequency of each word in a given text file.
    :param file:
    :return freq:
    """
    with open(file, 'r') as f:
        text = f.read().lower().split()
        freq = dict()
        for word in text:
            if word in freq:
                freq[word] += 1
            else:
                freq[word] = 1
        f.close()
        return freq


def word_frequency_string(string):
    """
    Function to count the frequency of each word in a given string of text.
    :param string:
    :return freq:
    """
    texts = string.lower().split()
    freq = dict()
    for word in texts:
        if word in freq:
            freq[word] += 1
        else:
            freq[word] = 1
    return freq


def word_frequency_case_sensitive(string):
    """
    A case-sensitive function to count the frequency of each word in a given string of text.
    :param string:
    :return freq:
    """
    texts = string.split()
    freq = dict()
    for word in texts:
        if word in freq:
            freq[word] += 1
        else:
            freq[word] = 1
    return freq


def remove_punctuation(file):
    """
    Function to remove punctuation from a given string of text.
    :param file:
    :return text:
    """
    punctuations = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''
    with open(file, 'r') as f:
        text = f.read()
        for char in text:
            if char in punctuations:
                text = text.replace(char, '')
        f.close()
        return text


def remove_stop_words(file):
    """
    Function to remove stop words from a given text file.
    :param file:
    :return text:
    """
    cleaned_text = remove_punctuation(file).lower().split()
    text = list()
    for word in cleaned_text:
        if word not in stop_words:  # stop_words is a list of common words like "the", "is", "and" etc. in a file sw.py
            text.append(word)
    return text


def tokenize_sentences(file):
    """
    Function to tokenize words and sentences in a given text file.
    :param file:
    :return words, sentences:
    """
    with open(file, 'r') as f:
        text = f.read()
        words = nltk.word_tokenize(text)
        sentences = nltk.sent_tokenize(text)
        f.close()
        return words, sentences


print(word_frequency_file('files/texts.txt'))

message = input("Enter some texts: ")
print(word_frequency_string(message))
print(word_frequency_case_sensitive(message))

print(remove_punctuation('files/texts.txt'))
print(remove_stop_words('files/texts.txt'))

tokenized_words, tokenized_sentences = tokenize_sentences('files/texts.txt')
print(f'Tokenized words:\n{tokenized_words}',
      '\n\n',
      f'Tokenized sentences:\n{tokenized_sentences}')
