import random
guess_number = random.randint(1,100)
print("Guess a number(1 ~ 100)")
users_input = int(input())
while(users_input is not guess_number):
  if users_input > guess_number:
    print("number is big")
  else:
    print("number is small")
  users_input = int(input())
else:
    print("right","the answer is",users_input)