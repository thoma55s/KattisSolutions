input = raw_input()
cup = ["ball","empty","empty"]
for x in input:
    if(x == "A"):
        temp = cup[0]
        cup[0] = cup[1]
        cup[1] = temp
    if(x == "B"):
        temp = cup[1]
        cup[1] = cup[2]
        cup[2] = temp
    if(x == "C"):
        temp = cup[0]
        cup[0] = cup[2]
        cup[2] = temp

index = 1
for x in cup:
    if(x == "ball"):
        print(index)
    index += 1