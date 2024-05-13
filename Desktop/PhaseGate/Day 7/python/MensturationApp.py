from datetime import datetime, timedelta

Mensturation_Day = input("Enter Day in YYYY-MM-DD Format ")

datetime = datetime.strptime(Mensturation_Day, "%Y-%m-%d")

Period_Last = int(input("How Long Does Your Period Last "))

Menstural_Cycle = int(input("How Long Is Your Menstural Cycle "))

Next_Period = datetime + timedelta(days=Menstural_Cycle)

End_Period = Next_Period + timedelta(days=Period_Last)

Ovulation = Next_Period + timedelta(days=9)

End_Ovulation = Ovulation + timedelta(days=5)

print(f'The Start Of Your Next Period is {Next_Period}')
print(f'The End Of Your Next Period is {End_Period}')

print()

print(f'The Start Of Your Ovulation(fertile days) is {Ovulation}')
print(f'The End Of Your Ovulation(Fertile days) is {End_Ovulation}')

