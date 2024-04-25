# Scores
p1Score = 100
p2Score = 100

roundedPlayed = int(input())

for i in range(roundedPlayed):
    rolls = str(input()).split()
    p1Roll = int(rolls[0])
    p2Roll = int(rolls[1])

    if p1Roll > p2Roll:
        p2Score -= p1Roll
    elif p1Roll < p2Roll:
        p1Score -= p2Roll

print(p1Score)
print(p2Score)