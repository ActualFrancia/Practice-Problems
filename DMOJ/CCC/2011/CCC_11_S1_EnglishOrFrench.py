n = int(input())

tCount = 0
sCount = 0

for i in range(n):
    line = str(input()).lower()
    tCount += line.count('t')
    sCount += line.count('s')

if tCount > sCount:
    print("English")
else:
    print("French")