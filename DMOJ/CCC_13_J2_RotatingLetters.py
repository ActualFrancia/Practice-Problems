letters = ["I", "O", "S", "H", "Z", "X", "N"]
word = str(input())

acceptableWord = True

for c in word:
    if c not in letters:
        acceptableWord = False
        break

if acceptableWord:
    print("YES")
else:
    print("NO")