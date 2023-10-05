"""
ID Numbers:


"""

names = ["Amina", "Fauzia", "Kamila", "Zainab", "Samira"]
scores = [22, 56, 89, 67, 45]


def calculate_average():
    total = 0
    for i in scores:
        total += i
    average = total / len(scores)
    return average


def find_highest_score():
    highest_score = scores[0]
    student_name = ""
    for i in range(len(scores)):
        if scores[i] > highest_score:
            highest_score = scores[i]
            student_name = names[i]
    return student_name, highest_score


def find_lowest_score():
    lowest_score = scores[0]
    index = 0
    for i in range(len(scores)):
        if scores[i] < lowest_score:
            lowest_score = scores[i]
            index = i
    return index, lowest_score


def analyze_grades():
    for i in range(len(scores)):
        if scores[i] >= 70:
            grade = 'A'
            names[i] += ': ' + grade
        elif 60 <= scores[i] < 70:
            grade = 'B'
            names[i] += ': ' + grade
        elif 50 <= scores[i] < 60:
            grade = 'C'
            names[i] += ': ' + grade
        elif 40 <= scores[i] < 50:
            grade = 'D'
            names[i] += ': ' + grade
        else:
            grade = 'F'
            names[i] += ': ' + grade
    return names


print(f"The average score is = {calculate_average()}")

best_student, high_score = find_highest_score()
print(f"The student with the highest score is {best_student} with {high_score}")

poorest_student, low_score = find_lowest_score()
print(f"The student with the lowest score is {names[poorest_student]} with {low_score}")

print(f"Final results are: {analyze_grades()}")
