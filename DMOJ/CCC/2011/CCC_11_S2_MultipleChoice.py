def inputToArray(n):
    result = []

    for i in range(n):
        result.append(str(input()))
    
    return result

# Main
n = int(input())

studentAnswers = inputToArray(n)
answerKey = inputToArray(n)

correctAnswers = 0
for i in range(n):
    if studentAnswers[i] == answerKey[i]:
        correctAnswers += 1

print(correctAnswers)