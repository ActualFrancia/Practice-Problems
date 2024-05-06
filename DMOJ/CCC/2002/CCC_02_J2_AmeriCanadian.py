vowels = ["a", "e", "i", "o", "u", "y"]

# Check if word is american
def checkAmerican(word):
    if (len(word) > 4) and (word[-2:] == "or"):
        # Check if [-3] is consonent
        if word[-3] not in vowels:
            return word[:-2] + "our"
    
    return word

# Main
isRunning = True

while isRunning:
    word = str(input())

    if word == "quit!":
        isRunning = False
    
    else:
        print(checkAmerican(word))