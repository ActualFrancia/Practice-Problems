n = int(input())

# Assign Beginning Hand State
hand1 = min(n, 5)
hand2 = max(0, n - 5)

# Calculate
count = 0

while (hand1 >= 0) and (hand2 <= 5) and (hand2 <= hand1):
    count += 1

    hand1 -= 1
    hand2 += 1

print(count)

# Notes:
#  1 = 1

#  2 = 2
#  3 = 2

#  4 = 3
#  5 = 3
#  6 = 3

#  7 = 2
#  8 = 2

#  9 = 1
# 10 = 1