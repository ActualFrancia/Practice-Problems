# Horizontal Flip
def flipH(grid):
    grid = [grid[1],
            grid[0]]
    return grid

# Vertical Flip
def flipV(grid):
    grid = [[grid[0][1], grid[0][0]],
            [grid[1][1], grid[1][0]]]
    return grid

# Main
grid = [[1 , 2], 
        [3 , 4]]

commands = str(input())

for c in commands:
    if c == "H":
        grid = flipH(grid)
    else:
        grid = flipV(grid)

print(str(grid[0][0]) + " " + str(grid[0][1]))
print(str(grid[1][0]) + " " + str(grid[1][1]))