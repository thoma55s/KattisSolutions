n =  int(raw_input())
direrctions = raw_input()
array = []
for char in direrctions:
    array.append(char)


count = 0


def path(array):
    i = 0
    start = 1
    started = False
    rightStart = False
    while(i < len(array)):
        
        while(array[i] == "L" and started == False):
            start += 1
            if((i+1) >= len(array) or array[i+1] == "R"):
                started = True

                print(start)
                subbegin = start
                k = 1
                if((i+1) >= len(array)):
                    start += 1
                while(k < subbegin):
                    subbegin -= 1

                    print(subbegin)                    
                break
            i += 1
        #print("what")

        if(started == False):
            print(start)
            started = True
            rightStart = True
            


        
        if(((i) < len(array) and array[i] == "R")):
            if((i+1) == len(array) or array[i+1] == "R"):
                start += 1
                print(start)                
            else:
                subcount = 0
                while(((i+1) < len(array)) and array[i+1] == "L"):                    
                    start += 1
                    subcount +=1
                    i += 1
                start += 1    
                print(start)    
                j = 0
                substart = start
                while(j < subcount):
                    substart -= 1
                    print(substart)  
                    j += 1  
        #if(((i+1) < len(array)) and array[i] == "L"):
        #    print("left")
        #    print(start - 1)            
                    
        i += 1   
                
                    
                
        


path(array)
    


