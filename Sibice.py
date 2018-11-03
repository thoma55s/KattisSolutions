import math

input = raw_input()
split = input.split()
matches = int(split[0])
width = int(split[1])
height = int(split[2])

i = 0
matchSizes = []
while(i < matches):
    matchSizes.append(int(raw_input()))
    i +=1
for match in matchSizes:
    if(match <= width or match <= height or match <= math.sqrt(width * width + height * height)):
        print("DA")
    else:
        print("NE")
