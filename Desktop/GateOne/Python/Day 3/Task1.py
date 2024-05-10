import random

correct = 0
incorrect = 0

number1 = 0
number2 = 0

result = 0



for number in range(10):
	number1 = random.randrange(10)
	number2 = random.randrange(10)

	result = number1 * number2
	
	print(f'{number1} * {number2} = ')

	answer = int(input("Enter answer"))

	if answer == result:
		correct+=1
		print("correct")
	
	else:
		incorrect+=1
		print("incorrect")

print(f'The number of correct answers are {correct}')
print(f'The number of incorrect answers are {incorrect}')



	




