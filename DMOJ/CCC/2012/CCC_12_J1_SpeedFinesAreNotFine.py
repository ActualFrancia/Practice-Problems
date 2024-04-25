speedLimit = int(input())
radarSpeed = int(input())

if radarSpeed <= speedLimit:
    print("Congratulations, you are within the speed limit!")
else:
    if radarSpeed - speedLimit <= 20:
        print("You are speeding and your fine is $100.")
    elif radarSpeed - speedLimit <= 30:
        print("You are speeding and your fine is $270.")
    else:
        print("You are speeding and your fine is $500.")