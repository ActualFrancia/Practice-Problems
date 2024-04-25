def gamble(quarters, timesPlayed, winNumber, payout):
    quarters -= 1
    timesPlayed += 1

    if timesPlayed == winNumber:
        quarters += payout
        timesPlayed = 0

    return quarters, timesPlayed
    

# Quarters
quarters = int(input())

# Machine 1
m1TimesPlayed = int(input())
m1Payout = 30
m1Win = 35

# Machine 2
m2TimesPlayed = int(input())
m2Payout = 60
m2Win = 100

# Machine 3
m3TimesPlayed = int(input())
m3Payout = 9
m3Win = 10

# Main
playCount = 0
machineNumber = 1

while quarters > 0:
    if machineNumber == 1:
        quarters, m1TimesPlayed = gamble(quarters, m1TimesPlayed, m1Win, m1Payout)
        machineNumber = 2

    elif machineNumber == 2:
        quarters, m2TimesPlayed = gamble(quarters, m2TimesPlayed, m2Win, m2Payout)
        machineNumber = 3

    elif machineNumber == 3:
        quarters, m3TimesPlayed = gamble(quarters, m3TimesPlayed, m3Win, m3Payout)
        machineNumber = 1

    playCount += 1

print("Martha plays " + str(playCount) + " times before going broke.")