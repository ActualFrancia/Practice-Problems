result = 0

for i in range(3):
    result += int(input()) * (i + 1)

if result >= 10:
    print("happy")
else:
    print("sad")