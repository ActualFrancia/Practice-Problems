parkingSpaces = int(input())

data1 = str(input())
data2 = str(input())

n = 0
for i in range(parkingSpaces):
    if data1[i] == data2[i] and data1[i] == 'C':
        n += 1

print(str(n))
