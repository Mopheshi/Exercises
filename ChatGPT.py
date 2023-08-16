import openai

# Set your OpenAI API key here
openai.api_key = 'YOUR_API_KEY'


# Generate a creative story based on a prompt
def generate_story(prompt):
    response = openai.Completion.create(
        engine="davinci",
        prompt=prompt,
        max_tokens=200
    )
    return response.choices[0].text.strip()


# Main function
def main():
    prompt = "In a mystical forest, a young wizard named Elara discovered an ancient book that glowed with a soft, eerie light. As she opened the book, she felt a surge of power and a voice whispered..."

    story = generate_story(prompt)
    print(story)


if __name__ == "__main__":
    main()
