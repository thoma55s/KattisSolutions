data = int(raw_input())
months = int(raw_input())
i = 0
used = []
while(i < months):

    input = int(raw_input())
    used.append(input)
    i += 1

output = data

for x in used:
    output -= x
    output += data

print(output)