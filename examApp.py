from flask import Flask, render_template, request

app = Flask(__name__)

# Define the exam questions
questions = [
    {
        "id": 1,
        "question": "What is the capital of France?",
        "options": ["Paris", "London", "Berlin", "Madrid"],
        "answer": "Paris"
    },
    {
        "id": 2,
        "question": "What is the square root of 16?",
        "options": ["2", "4", "6", "8"],
        "answer": "4"
    },
    {
        "id": 3,
        "question": "Who wrote the play 'Romeo and Juliet'?",
        "options": ["Shakespeare", "Hemingway", "Fitzgerald", "Twain"],
        "answer": "Shakespeare"
    }
]


@app.route("/")
def index():
    return render_template("index.html", questions=questions)


@app.route("/submit", methods=["POST"])
def submit():
    score = 0
    for question in questions:
        user_answer = request.form.get("question{}".format(question["id"]))
        if user_answer.lower() == question["answer"].lower():
            score += 1
    return render_template("result.html", score=score, total=len(questions))


if __name__ == "__main__":
    app.run(debug=True)
