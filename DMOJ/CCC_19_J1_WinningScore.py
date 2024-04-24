teamScores = [0, 0]

for i in range(2):
    # 3 points
    teamScores[i] += int(input()) * 3
    # 2 points
    teamScores[i] += int(input()) * 2
    # 1 point
    teamScores[i] += int(input())

if teamScores[0] > teamScores[1]:
    print("A")
elif teamScores[0] < teamScores[1]:
    print("B")
else:
    print("T")