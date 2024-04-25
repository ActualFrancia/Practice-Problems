n = int(input())
shift = int(input())

result = 0
for i in range(shift + 1):
    result += n * 10**i

print(result)