cards = raw_input()

t = 0
c = 0
g = 0

for x in cards:
    if(x == "T"):
        t += 1
    if(x == "C"):
        c += 1
    if(x == "G"):
        g += 1

print(t * t + c * c + g * g + 7 * min(t,c,g))

