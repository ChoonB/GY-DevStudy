# sep은 구분자로 미지정시 공백 기준. maxsplit은 문자열을 나눌 최대 횟수로 미지정시 전체 나눔

csv_line = "apple,banana,cherry"
fruits = csv_line.split(',')  # 콤마를 기준으로 나눔
print(fruits)  # ['apple', 'banana', 'cherry']

# join은 리스트나 튜블같은 iterable을 하나로 합침
# sep.join(iterable)

words = ['Python', 'is', 'fun']
sentence = ' '.join(words)  # 공백을 구분자로 리스트 요소들을 결합
print(sentence)  # 'Python is fun'

fruits = ['apple', 'banana', 'cherry']
csv_line = ','.join(fruits)  # 콤마를 구분자로 리스트 요소들을 결합
print(csv_line)  # 'apple,banana,cherry'

numbers = [1, 2, 3, 4, 5]
evens = [n for n in numbers if n % 2 == 0]
print(evens)  # [2, 4]

matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
flat = [num for row in matrix for num in row]
print(flat)  # [1, 2, 3, 4, 5, 6, 7, 8, 9]

fruits = ['apple', 'banana', 'cherry']

for index, fruit in enumerate(fruits):
    print(index, fruit)
# 0 apple
# 1 banana
# 2 cherry

# 인덱스를 1부터 시작
for index, fruit in enumerate(fruits, start=1):
    print(index, fruit)
# 1 apple
# 2 banana
# 3 cherry

names = ['Alice', 'Bob']
ages = [25, 30, 35]

for name, age in zip(names, ages):
    print(f"{name} is {age} years old.")
# 출력:
# Alice is 25 years old.
# Bob is 30 years old.

# 함께 사용시
names = ['Alice', 'Bob', 'Charlie']
ages = [25, 30, 35]
cities = ['New York', 'Los Angeles', 'Chicago']

for index, (name, age, city) in enumerate(zip(names, ages, cities)):
    print(f"{index}: {name} is {age} years old and lives in {city}.")
# 출력:
# 0: Alice is 25 years old and lives in New York.
# 1: Bob is 30 years old and lives in Los Angeles.
# 2: Charlie is 35 years old and lives in Chicago.

add = lambda x, y: x + y
print(add(2, 3))  # 출력: 5

numbers1 = [1, 2, 3]
numbers2 = [4, 5, 6]
summed = map(lambda x, y: x + y, numbers1, numbers2)
print(list(summed))  # 출력: [5, 7, 9]

from functools import reduce

numbers = [1, 2, 3, 4, 5]
product = reduce(lambda x, y: x * y, numbers)
print(product)  # 출력: 120

numbers = [1, 2, 3, 4, 5]
iterator = iter(numbers)

print(next(iterator))  # 출력: 1
print(next(iterator))  # 출력: 2
print(next(iterator))  # 출력: 3
print(next(iterator))  # 출력: 4
print(next(iterator))  # 출력: 5
# print(next(iterator))  # StopIteration 예외 발생


# 제너레이터 표현식
squares_gen = (x**2 for x in range(5))
print(next(squares_gen))  # 출력: 0
print(next(squares_gen))  # 출력: 1
print(next(squares_gen))  # 출력: 4
print(next(squares_gen))  # 출력: 9
print(next(squares_gen))  # 출력: 16
# print(next(squares_gen))  # StopIteration 예외 발생

def sum_numbers(*args):
    total = sum(args)
    print(f"The sum is {total}")

sum_numbers(1, 2, 3)
# 출력: The sum is 6

sum_numbers(4, 5, 6, 7)
# 출력: The sum is 22

def print_info(**kwargs):
    for key, value in kwargs.items():
        print(f"{key}: {value}")

print_info(name="Alice", age=30, city="New York")
# 출력:
# name: Alice
# age: 30
# city: New York
