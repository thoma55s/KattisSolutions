input = raw_input()
output = ""
splitInput = input.split("-")
for x in splitInput:
    output += x[0]
print(output)