"""
@ChatGPT
@Mopheshi
"""


def display_question(question):
    print(question)


def get_answer():
    answer = input("Your answer: ")
    return answer


class Exam:
    def __init__(self, questions):
        self.questions = questions
        self.score = 0

    def grade_exam(self):
        for question in self.questions:
            display_question(question["question"])
            answer = get_answer()

            if answer.lower() == question["answer"].lower():
                self.score += 1

        total_questions = len(self.questions)
        print("\nExam complete!")
        print("Your score: {}/{}".format(self.score, total_questions))


# Example usage
questions = [
    {
        "question": "What is the capital of France?",
        "answer": "Paris"
    },
    {
        "question": "What is the square root of 16?",
        "answer": "4"
    },
    {
        "question": "Who wrote the play 'Romeo and Juliet'?",
        "answer": "Shakespeare"
    }
]

exam = Exam(questions)
exam.grade_exam()
