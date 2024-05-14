import nltk
import spacy
from nltk import word_tokenize, pos_tag
from nltk.corpus import twitter_samples
from spacytextblob.spacytextblob import SpacyTextBlob

from vars import message, positive_words, negative_words, reviews, categories

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


def sentiment_analysis_nltk(tweets):
    """
    Function to perform sentiment analysis on a collection of tweets using NLTK.
    :param tweets: List of tweets to be analyzed.
    :return: List of tuples containing tweet text and corresponding sentiment (positive, negative, or neutral).
    """
    sentiment_scores = []  # Initialize an empty list to store sentiment scores
    for tweet in tweets:  # Iterate over each tweet
        words = word_tokenize(tweet.lower())  # Tokenize the tweet and convert to lowercase
        positive_score = sum(1 for word in words if word in positive_words)  # Calculate positive score
        negative_score = sum(1 for word in words if word in negative_words)  # Calculate negative score
        if positive_score > negative_score:  # Assign sentiment based on score comparison
            sentiment = "positive"
        elif positive_score < negative_score:
            sentiment = "negative"
        else:
            sentiment = "neutral"
        sentiment_scores.append((tweet, sentiment))  # Append tweet and sentiment to the list
    return sentiment_scores  # Return the list of sentiment scores


def sentiment_analysis_nltk_optimized(tweets):
    """
    Function to perform sentiment analysis on a collection of tweets using NLTK.
    :param tweets: List of tweets to be analyzed.
    :return: List of tuples containing tweet text and corresponding sentiment (positive, negative, or neutral).
    """
    sentiment_scores = []  # Initialize an empty list to store sentiment scores
    for tweet in tweets:  # Iterate over each tweet
        words = word_tokenize(tweet.lower())  # Tokenize the tweet and convert to lowercase
        positive_score = 0  # Initialize positive score
        negative_score = 0  # Initialize negative score
        for word in words:  # Iterate over words
            if word in positive_words:  # Check if word is in positive words
                positive_score += 1  # Increment positive score
            elif word in negative_words:  # Check if word is in negative words
                negative_score += 1  # Increment negative score
        if positive_score > negative_score:  # Assign sentiment based on score comparison
            sentiment = "positive"
        elif positive_score < negative_score:
            sentiment = "negative"
        else:
            sentiment = "neutral"
        sentiment_scores.append((tweet, sentiment))  # Append tweet and sentiment to the list
    return sentiment_scores  # Return the list of sentiment scores


def text_classification_nltk(text):
    """
    Function to perform a basic text classifier using NLTK.
    :param text: Input text to be classified.
    :return: Predicted category for the input text.
    """
    # Tokenize the input text
    tokens = word_tokenize(text.lower())
    # Initialize category scores
    category_scores = {category: 0 for category in categories}
    # Calculate category scores based on keyword matches
    for token in tokens:
        for category, keywords in categories.items():
            if token in keywords:
                category_scores[category] += 1
    # Predict the category with the highest score
    predicted_category = max(category_scores, key=category_scores.get)
    return predicted_category


def text_classification_spacy(text):
    """
    Function to classify customer support tickets into different
    categories based on their content using spaCy.
    NOTE: This function uses the spaCy model loaded earlier in the script, and it is not optimal for this task.
    :param text: Input text to be classified.
    :return: Predicted category for the input text.
    """
    doc = nlp(text)  # Process the text using the spaCy model
    category_scores = {category: 0 for category in categories}  # Initialize category scores
    for token in doc:  # Iterate over tokens in the document
        for category, keywords in categories.items():  # Iterate over categories and keywords
            if token.text.lower() in keywords:  # Check if token is in the category keywords
                category_scores[category] += 1  # Increment category score
    predicted_category = max(category_scores, key=category_scores.get)  # Predict the category with the highest score
    return predicted_category  # Return the predicted category


# print(pos_tagging_nltk(message))
# print(pos_tagging_spacy(message))
# print(ner_nltk(message))
# print(ner_spacy(message))

# Tweets for sentiment analysis
# positive_tweet = twitter_samples.strings('positive_tweets.json')[:50]  # Limit the number of tweets to first 50
# negative_tweet = twitter_samples.strings('negative_tweets.json')[:50]  # Limit the number of tweets to first 50
# tweets = positive_tweet + negative_tweet # Combine positive and negative tweets (optional)
# print(sentiment_analysis_nltk(tweets))

# print(sentiment_analysis_spacy(reviews))

# print(text_classification_nltk(message))
print(text_classification_spacy(message))


# Text Summarization:
# a. Write a script using NLTK to summarize a given text document by extracting the most important sentences.
# b. Experiment with spaCy to build a text summarization model that generates concise summaries of news articles or
# research papers.
def summarize_nltk(text):
    """
    Function to summarize a given text document using NLTK.
    :param text: Input text to be summarized.
    :return: Summary of the text document.
    """
    pass


def summarize_spacy(text):
    """
    Function to summarize a given text document using spaCy.
    :param text: Input text to be summarized.
    :return: Summary of the text document.
    """
    pass
