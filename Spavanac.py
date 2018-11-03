input = raw_input()
time = input.split()
hours = int(time[0])
minutes = int(time[1])

minutes -= 45

if (minutes < 0):
    minutes +=60
    hours -= 1 
    if(hours < 0):
        hours = 23

print hours,
print minutes,