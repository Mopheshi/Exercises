import nltk
from nltk import word_tokenize, pos_tag

import spacy

# Download the models if not already installed
# nltk.download("popular")
# You can also run this command in your terminal: python -m spacy download en_core_web_sm
# spacy.cli.download("en_core_web_sm")
# Load the spaCy model
nlp = spacy.load("en_core_web_sm")


def pos_tagging_nltk(text):
    """
    Function to perform part-of-speech tagging using NLTK.
    :param text: Input text to be processed.
    :return: List of tuples containing token and corresponding part-of-speech tag.
    """
    tokens = word_tokenize(text)  # Tokenize the text
    pos_tags = pos_tag(tokens)  # Perform part-of-speech tagging
    return pos_tags


def pos_tagging_spacy(text):
    """
    Function to tokenize a sentence and display the part-of-speech tags for each token using spaCy.
    :param text: Input sentence to be processed.
    :return: List of tuples containing token and corresponding part-of-speech tag.
    """
    doc = nlp(text)  # Process the sentence using the spaCy model
    pos_tags = [(token.text, token.pos_) for token in doc]  # Extract token and part-of-speech tag
    return pos_tags


def ner_nltk(text):
    """
    Function to perform named entity recognition using NLTK.
    :param text: Input text to be processed.
    :return: List of named entities extracted from the text.
    """
    tokens = word_tokenize(text)  # Tokenize the text
    pos_tags = pos_tag(tokens)  # Perform part-of-speech tagging
    ne_chunks = nltk.ne_chunk(pos_tags)  # Perform named entity recognition
    named_entities = []  # Initialize an empty list to store named entities
    for chunk in ne_chunks:  # Iterate over the named entity chunks
        if hasattr(chunk, "label"):  # Check if the chunk has a label (i.e., is a named entity)
            named_entities.append(" ".join(c[0] for c in chunk))  # Extract named entities
    return named_entities  # Return the list of named entities


def ner_spacy(text):
    """
    Function to extract named entities and their corresponding labels using spaCy.
    :param text: Input text to be processed.
    :return: List of tuples containing named entity text and label.
    """
    doc = nlp(text)  # Process the text using the spaCy model
    named_entities = [(entity.text, entity.label_) for entity in doc.ents]  # Extract named entities and labels
    return named_entities  # Return the list of named entities


# Sentiment Analysis:
# a. Write a Python script using NLTK to perform sentiment analysis on a collection of tweets and classify them as
# positive, negative, or neutral.
# b. Develop a sentiment analysis model using spaCy to analyze the sentiment of product reviews and assign a sentiment
# score to each review.


message = '''
    Natural Language Processing (NLP) is a subfield of artificial intelligence that focuses on the interaction
    between computers and humans using natural language. It is used to apply machine learning algorithms to text and
    speech. Some common NLP tasks include part-of-speech tagging, named entity recognition, sentiment analysis,
    and text classification.
    '''
# print(pos_tagging_nltk(message))
# print(pos_tagging_spacy(message))
# print(ner_nltk(message))
print(ner_spacy(message))

# Text Classification:
# a. Use NLTK to build a basic text classifier to categorize news articles into predefined categories like sports,
# politics, technology, etc.
# b. Implement a more advanced text classification model using spaCy to classify customer support tickets into different
# categories based on their content.

# Text Summarization:
# a. Write a script using NLTK to summarize a given text document by extracting the most important sentences.
# b. Experiment with spaCy to build a text summarization model that generates concise summaries of news articles or
# research papers.
