# Input
k = int(input())

numList = []
for i in range(k):
    n = int(input())

    if n != 0:
        numList.append(n)
    else:
        numList.pop(-1)

result = sum(numList)
print(result)