# import nltk
from nltk import word_tokenize, pos_tag

import spacy

# Download the models if not already installed
# nltk.download("popular")
# You can also run this command in your terminal: python -m spacy download en_core_web_sm
# spacy.cli.download("en_core_web_sm")
# Load the spaCy model
nlp = spacy.load("en_core_web_sm")


def pos_tagging(text):
    """
    Function to perform part-of-speech tagging using NLTK.
    :param text: Input text to be processed.
    :return: List of tuples containing token and corresponding part-of-speech tag.
    """
    tokens = word_tokenize(text)  # Tokenize the text
    pos_tags = pos_tag(tokens)  # Perform part-of-speech tagging
    return pos_tags


def pos_tagging_spacy(sentence):
    """
    Function to tokenize a sentence and display the part-of-speech tags for each token using spaCy.
    :param sentence: Input sentence to be processed.
    :return: List of tuples containing token and corresponding part-of-speech tag.
    """
    doc = nlp(sentence)  # Process the sentence using the spaCy model
    pos_tags = [(token.text, token.pos_) for token in doc]  # Extract token and part-of-speech tag
    return pos_tags


message = '''
    Natural language processing (NLP) is a subfield of artificial intelligence that focuses on the interaction
    between computers and humans using natural language. It is used to apply machine learning algorithms to text and
    speech. Some common NLP tasks include part-of-speech tagging, named entity recognition, sentiment analysis,
    and text classification.
    '''
# print(pos_tagging(message))
print(pos_tagging_spacy(message))

# Named Entity Recognition (NER):
# a. Create a script using NLTK to perform named entity recognition on a text document and extract all named entities.
# b. Implement a function with spaCy to identify named entities in a sentence and classify them into predefined
# categories like person, organization, location, etc.

# Sentiment Analysis:
# a. Write a Python script using NLTK to perform sentiment analysis on a collection of tweets and classify them as
# positive, negative, or neutral.
# b. Develop a sentiment analysis model using spaCy to analyze the sentiment of product reviews and assign a sentiment
# score to each review.

# Text Classification:
# a. Use NLTK to build a basic text classifier to categorize news articles into predefined categories like sports,
# politics, technology, etc.
# b. Implement a more advanced text classification model using spaCy to classify customer support tickets into different
# categories based on their content.

# Text Summarization:
# a. Write a script using NLTK to summarize a given text document by extracting the most important sentences.
# b. Experiment with spaCy to build a text summarization model that generates concise summaries of news articles or
# research papers.
