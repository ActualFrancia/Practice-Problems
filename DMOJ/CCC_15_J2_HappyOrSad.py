# Input
inputString = str(input())

happyCount = int(inputString.count(":-)"))
sadCount = int(inputString.count(":-("))

if happyCount < 1 and sadCount < 1:
    print("none")
elif happyCount > sadCount:
    print("happy")
elif happyCount < sadCount:
    print("sad")
elif happyCount == sadCount:
    print("unsure")