numAdjectives = int(input())
numNouns = int(input())

adjectives = []
for i in range(numAdjectives):
    adjectives.append(str(input()))

nouns = []
for i in range(numNouns):
    nouns.append(str(input()))

for i in range(len(adjectives)):
    for j in range(len(nouns)):
        print(adjectives[i] + " as " + nouns[j])