input = raw_input()
splits = input.split(" ")
light1 = int(splits[0])
light2 = int(splits[1])
time = int(splits[2])
newlight1 = light1
newlight2 = light2
light1s = []
no = True
while(light1 <= time):
    light1s.append(light1)
    light1 += newlight1
while(light2 <= time):
    if(light2 in light1s):
        print("yes")
        no = False
        break
    light2 += newlight2
if(no):
    print("no")