import random

# List of inspirational words
inspirational_words = [
    "believe", "dream", "achieve", "success",
    "perseverance", "passion", "opportunity",
    "motivation", "hope", "goals", "growth"
]

# List of positive adjectives
positive_adjectives = [
    "amazing", "wonderful", "inspiring", "uplifting",
    "empowering", "remarkable", "excellent", "encouraging"
]


# Generate a random inspirational quote
def generate_quote():
    word1 = random.choice(inspirational_words)
    word2 = random.choice(inspirational_words)
    adj = random.choice(positive_adjectives)
    return f"Believe in the {adj} power of {word1} and {word2}."


# Main function
def main():
    quote = generate_quote()
    print(quote)


if __name__ == "__main__":
    main()
