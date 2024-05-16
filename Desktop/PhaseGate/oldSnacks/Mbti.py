selectionA1 = 0
selectionB1 = 0
selectionA2 = 0
selectionB2 = 0
selectionA3 = 0
selectionB3 = 0
selectionA4 = 0
selectionB4 = 0


name = str(input("What is your name: "))

print()

# Extroverted Vs Introverted questions

print("A. expend energy, enjoy groups         B. Conserve energy, enjoy one-on-one")

question1 = str(input(""))

if question1 == ("A") or question1 == ("a"):
	selectionA1 += 1
	
elif question1 == ("B") or question1 == ("b"):
	selectionB1 += 1

elif question1 != ("A") or question1 != ("B") or question1 != ("a") or question1 != ("b"):
	print("error input A or B")

print()


print("A. More outgoing, think out loud         B. More reserved, think to yourself")

question2 = str(input(""))

if question2 == ("A") or question2 == ("a"):
	selectionA1 += 1
	
elif question1 == ("B") or question2 == ("b"):
	selectionB1 += 1

elif question2 != ("A") or question2 != ("B") or question2 != ("a") or question2 != ("b"):
	print("error input A or B")

print()


print("A. Seek many tasks, Public activities, Interation with Others         B. Seek private, Solitary activities with quiet to concentrate");

question3 = str(input(""))

if question3 == ("A") or question3 == ("a"):
	selectionA1 += 1
	
elif question3 == ("B") or question3 == ("b"):
	selectionB1 += 1

elif question3 != ("A") or questio3 != ("B") or question3 != ("a") or question3 != ("b"):
	print("error input A or B")

print()

print("A. External, Communicate, Express yourself         B. Internal, Reticient, keep to yourself")

question4 = str(input(""))

if question4 == ("A") or question4 == ("a"):
	selectionA1 += 1
	
elif question4 == ("B") or question4 == ("b"):
	selectionB1 += 1

elif question4 != ("A") or question4 != ("B") or question4 != ("a") or question4 != ("b"):
	print("error input A or B")

print()

print("A. Active, Initiate         B. Reflective, Deliberate")

question5 = str(input(""))

if question5 == ("A") or question5 == ("a"):
	selectionA1 += 1
	
elif question5 == ("B") or question5 == ("b"):
	selectionB1 += 1

elif question5 != ("A") or question5 != ("B") or question5 != ("a") or question5 != ("b"):
	print("error input A or B")


print()

print("Number of A selected is: ", selectionA1)
print("Number of B selected is: ", selectionB1)

# Sensing Vs Intuitive

print("A. Intercept literally         B. Look for meaning and possibility")

question6 = str(input(""))

if question6 == ("A") or question6 == ("a"):
	selectionA2 += 1
	
elif question6 == ("B") or question6 == ("b"):
	selectionB2 += 1

elif question6 != ("A") or question6 != ("B") or question6 != ("a") or question6 != ("b"):
	print("error input A or B")

print()


print("A. Practical, realistic, experiential         B. Imaginative, Inovative Theoretical")

question7 = str(input(""))

if question7 == ("A") or question7 == ("a"):
	selectionA2 += 1
	
elif question1 == ("B") or question7 == ("b"):
	selectionB2 += 1

elif question7 != ("A") or question7 != ("B") or question7 != ("a") or question7 != ("b"):
	print("error input A or B")

print()


print("A. Standard, Usual, conventional         B. Different, Novel, Unique");

question8 = str(input(""))

if question8 == ("A") or question8 == ("a"):
	selectionA2 += 1
	
elif question8 == ("B") or question8 == ("b"):
	selectionB2 += 1

elif question8 != ("A") or question8 != ("B") or question8 != ("a") or question8 != ("b"):
	print("error input A or B")

print()

print("A. Focus on here-and-now, Look at the future         B. Global pespective, Big picture")

question9 = str(input(""))

if question9 == ("A") or question9 == ("a"):
	selectionA2 += 1
	
elif question9 == ("B") or question9 == ("b"):
	selectionB2 += 1

elif question9 != ("A") or question9 != ("B") or question9 != ("a") or question9 != ("b"):
	print("error input A or B")

print()

print("A. Active, Initiate         B. Reflective, Deliberate")

question10 = str(input(""))

if question10 == ("A") or question10 == ("a"):
	selectionA2 += 1
	
elif question10 == ("B") or question10 == ("b"):
	selectionB2 += 1

elif question10 != ("A") or question10 != ("B") or question10 != ("a") or question10 != ("b"):
	print("error input A or B")


print()

print("Number of A selected is: ", selectionA2)
print("Number of B selected is: ", selectionB2)

# Thinking Vs Feeling

print("A. Logical, Thinking, Questioning         B. Empatethic, Feeling, Accomodating")

question11 = str(input(""))

if question11 == ("A") or question11 == ("a"):
	selectionA3 += 1
	
elif question11 == ("B") or question11 == ("b"):
	selectionB3 += 1

elif question11 != ("A") or question11 != ("B") or question11 != ("a") or question11 != ("b"):
	print("error input A or B")

print()


print("A. Candid, Straight Forward, Frank         B. Tactful, Kind, Encouraging")

question12 = str(input(""))

if question12 == ("A") or question12 == ("a"):
	selectionA3 += 1
	
elif question12 == ("B") or question12 == ("b"):
	selectionB3 += 1

elif question12 != ("A") or question7 != ("B") or question12 != ("a") or question7 != ("b"):
	print("error input A or B")

print()


print("A. Firm, Tend to critisize, Hold the line         B. Gentle, tend to appreciate, conciliate");

question13 = str(input(""))

if question13 == ("A") or question13 == ("a"):
	selectionA3 += 1
	
elif question13 == ("B") or question13 == ("b"):
	selectionB3 += 1

elif question13 != ("A") or question13 != ("B") or question13 != ("a") or question13 != ("b"):
	print("error input A or B")

print()

print("A. Tough minded, just         B. Tender Hearted, Merciful")

question14 = str(input(""))

if question14 == ("A") or question14 == ("a"):
	selectionA3 += 1
	
elif question14 == ("B") or question14 == ("b"):
	selectionB3 += 1

elif question14 != ("A") or question14 != ("B") or question14 != ("a") or question14 != ("b"):
	print("error input A or B")

print()

print("A. Matter of fact, Issue-Oriented         B. Sensitive, People Oriented, Passionate")

question15 = str(input(""))

if question15 == ("A") or question15 == ("a"):
	selectionA3 += 1
	
elif question15 == ("B") or question15 == ("b"):
	selectionB3 += 1

elif question15 != ("A") or question15 != ("B") or question15 != ("a") or question15 != ("b"):
	print("error input A or B")


print()

print("Number of A selected is: ", selectionA3)
print("Number of B selected is: ", selectionB3)

# Judging Vs Perceptive

print("A. Organized, Orderly         B. Flexible, Adaptable")

question16 = str(input(""))

if question16 == ("A") or question16 == ("a"):
	selectionA4 += 1
	
elif question16 == ("B") or question16 == ("b"):
	selectionB4 += 1

elif question16 != ("A") or question16 != ("B") or question16 != ("a") or question16 != ("b"):
	print("error input A or B")

print()


print("A. Plan, Schedule         B. Unplanned, Spontaneous")

question17 = str(input(""))

if question17 == ("A") or question17 == ("a"):
	selectionA4 += 1
	
elif question17 == ("B") or question17 == ("b"):
	selectionB4 += 1

elif question17 != ("A") or question17 != ("B") or question17 != ("a") or question17 != ("b"):
	print("error input A or B")

print()


print("A. Regulated, Structured         B. Easy going, Live and let live");

question18 = str(input(""))

if question18 == ("A") or question18 == ("a"):
	selectionA4 += 1
	
elif question18 == ("B") or question18 == ("b"):
	selectionB4 += 1

elif question18 != ("A") or question18 != ("B") or question18 != ("a") or question18 != ("b"):
	print("error input A or B")

print()

print("A. Preparation, Plan ahead         B. Go with the flow, Adapt as you go")

question19 = str(input(""))

if question19 == ("A") or question19 == ("a"):
	selectionA4 += 1
	
elif question19 == ("B") or question19 == ("b"):
	selectionB4 += 1

elif question19 != ("A") or question19 != ("B") or question19 != ("a") or question19 != ("b"):
	print("error input A or B")

print()

print("A. Control, Govern         B. Latitude, Freedom")

question20 = str(input(""))

if question20 == ("A") or question20 == ("a"):
	selectionA4 += 1
	
elif question20 == ("B") or question20 == ("b"):
	selectionB4 += 1

elif question20 != ("A") or question20 != ("B") or question20 != ("a") or question20 != ("b"):
	print("error input A or B")

print()

print("Number of A selected is: ", selectionA4)
print("Number of B selected is: ", selectionB4)

if (selectionA1 > selectionB1):
	print("E",end=' ')
		
else: 
	print("I",end=' ')
		
if (selectionA2 > selectionB2):
	print("S",end=' ')

else:
	print("N",end=' ')

if (selectionA3 > selectionB3):
	print("T",end=' ')

else:
	print("F",end=' ')

if (selectionA4 > selectionB4):
	print("J",end=' ')

else:
	print("P",end=' ')































