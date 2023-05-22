document.addEventListener("DOMContentLoaded", function() {
    const questionsContainer = document.getElementById("questionsContainer");
    const examForm = document.getElementById("examForm");
    const resultContainer = document.getElementById("resultContainer");
    const scoreText = document.getElementById("scoreText");

    // Define the exam questions
    const questions = [
        {
            question: "What is the capital of France?",
            options: ["Paris", "London", "Berlin", "Madrid"],
            answer: "Paris"
        },
        {
            question: "What is the square root of 16?",
            options: ["2", "4", "6", "8"],
            answer: "4"
        },
        {
            question: "Who wrote the play 'Romeo and Juliet'?",
            options: ["Shakespeare", "Hemingway", "Fitzgerald", "Twain"],
            answer: "Shakespeare"
        }
    ];

    // Display questions on the page
    questions.forEach((question, index) => {
        const questionDiv = document.createElement("div");
        questionDiv.classList.add("question");

        const questionText = document.createElement("h3");
        questionText.textContent = question.question;
        questionDiv.appendChild(questionText);

        question.options.forEach((option, optionIndex) => {
            const optionLabel = document.createElement("label");
            const optionInput = document.createElement("input");
            optionInput.type = "radio";
            optionInput.name = "question" + index;
            optionInput.value = option;
            optionLabel.appendChild(optionInput);
            optionLabel.innerHTML += option;
            questionDiv.appendChild(optionLabel);
        });

        questionsContainer.appendChild(questionDiv);
    });

    // Handle form submission
    examForm.addEventListener("submit", function(event) {
        event.preventDefault();

        // Calculate the score
        let score = 0;
        questions.forEach((question, index) => {
            const selectedOption = document.querySelector(
                'input[name="question' + index + '"]:checked'
            );

            if (selectedOption && selectedOption.value.toLowerCase() === question.answer.toLowerCase()) {
                score++;
            }
        });

        // Display the score
        scoreText.textContent = "Your score: " + score + "/" + questions.length;
        resultContainer.style.display = "block";