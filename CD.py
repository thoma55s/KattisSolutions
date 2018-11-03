
index = 0


while True:
	firstInput = raw_input()
	if(firstInput == "0 0"):
		break
	numOfCds = firstInput.split(" ")
	jack = int(numOfCds[0])
	jill = int(numOfCds[1])

	jacks = []
	s = set(int(raw_input()) for _ in range(jack))
	
	
	incommon = 0
	for _ in range(jill):
		if(int(raw_input()) in s):
			incommon += 1
	print(incommon)