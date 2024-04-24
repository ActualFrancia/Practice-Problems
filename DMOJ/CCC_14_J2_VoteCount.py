voteCount = int(input())

votes = str(input())
aVotes = votes.count('A')
bVotes = votes.count('B')

if aVotes > bVotes:
    print("A")
elif aVotes < bVotes:
    print("B")
else:
    print("Tie")