depthReadings = []

for i in range(4):
    depthReadings.append(int(input()))

result = None
for i in range(len(depthReadings) - 1):
    if depthReadings[i + 1] > depthReadings[i]:
        newResult = "Fish Rising"
    elif depthReadings[i + 1] < depthReadings[i]:
        newResult = "Fish Diving"
    else:
        newResult = "Fish At Constant Depth"

    if result is None:
        result = newResult
    elif newResult != result:
        result = "No Fish"
        break

print(result)