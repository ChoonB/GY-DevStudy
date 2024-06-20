class MyDog:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    
    def bark(self):
        print(f"{self.name}가 짖는중입니다.")

my_dog = MyDog("멍멍이", 3)
print(my_dog.name)  # 출력: 멍멍이
print(my_dog.age)   # 출력: 3
my_dog.bark()       # 출력: 멍멍이가 짖습니다!

class Animal:
    def speak(self):
        print("동물이 소리를 냅니다.")

class Dog(Animal):
    def bark(self):
        print("멍멍!")

class Cat(Animal):
    def meow(self):
        print("야옹~")


# 캡슐화
class Person:
    def __init__(self, name, age):
        self._name = name
        self._age = age
    
    @property
    def name(self):
        return self._name
    
    @property
    def age(self):
        return self._age
    
    @age.setter
    def age(self, value):
        if value > 0:
            self._age = value
        else:
            print("나이는 0보다 커야 합니다.")

# 객체 생성
person = Person("Alice", 30)

# @property를 통한 속성 접근
print(person.name)  # 출력: Alice
print(person.age)   # 출력: 30

# @property 및 setter를 통한 속성 변경
#person.name = "Bob"  # AttributeError: can't set attribute
person.age = 25
print(person.name)  # 출력: Alice
print(person.age)   # 출력: 25

# 일급함수
def greet(name):
    return f"안녕하세요, {name}님!"

# 함수를 변수에 할당
my_greet_function = greet

# 함수를 다른 함수의 인자로 전달
def call_greet_function(func, name):
    return func(name)

print(call_greet_function(my_greet_function, "Kim"))  # 출력: 안녕하세요, Kim님!

# decorator
def say_bye(func):
  def print_func():
      func()
      print("bye")
  return print_func

@say_bye
def say_hi():
    print("hi")

say_hi()

def answer(func):
    def inner_answer(*args, **kwargs):
        print(f"{func.__name__} start!")
        print("in progress..")
        print(f"result is {func(*args, **kwargs)}")
    return inner_answer

@answer
def add(a, b):
    return a+b

add(3,4)