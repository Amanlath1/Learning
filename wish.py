print("*Note: Time is of 24 HRS format")
hour = int(input("Enter the time of the day in hour: "))
print("Time is:",hour)
if hour<5:
  print("Good night")
elif hour>=5 and hour<11:
  print("Good Morning")
elif hour>=11 and hour<16:
  print("Good Afternoon")
elif hour>=16 and hour<20:
  print("Good Evening")
elif hour>=20 and hour<=24:
  print("Good Night")
else :
  print("Enter the correct hour of the day")
