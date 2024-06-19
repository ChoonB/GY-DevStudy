# 빈 리스트 생성
empty_list = []

# 요소가 있는 리스트 생성
numbers = [1, 2, 3, 4, 5]
fruits = ['apple', 'banana', 'cherry']
mixed = [1, 'apple', 3.14, [1, 2, 3]]

fruits = ['apple', 'banana', 'cherry']

# 첫 번째 요소 접근
print(fruits[0])  # apple

# 마지막 요소 접근
print(fruits[-1])  # cherry

# 리스트 슬라이싱
print(fruits[1:3])  # ['banana', 'cherry']

# append()를 사용하여 한 요소 추가
fruits = ['apple', 'banana']
fruits.append('cherry')
print(fruits)  # ['apple', 'banana', 'cherry']

# insert()를 사용하여 특정 위치에 요소 추가
fruits.insert(1, 'blueberry')
print(fruits)  # ['apple', 'blueberry', 'banana', 'cherry']

# extend()를 사용하여 여러 요소 추가
fruits.extend(['date', 'elderberry'])
print(fruits)  # ['apple', 'blueberry', 'banana', 'cherry', 'date', 'elderberry']

# pop()을 사용하여 마지막 요소 제거 및 반환
fruits = ['apple', 'banana', 'cherry']
last_fruit = fruits.pop()
print(last_fruit)  # cherry
print(fruits)  # ['apple', 'banana']

# remove()를 사용하여 특정 요소 제거
fruits.remove('banana')
print(fruits)  # ['apple']

# del을 사용하여 특정 인덱스의 요소 제거
del fruits[0]
print(fruits)  # []

# clear()를 사용하여 모든 요소 제거
fruits = ['apple', 'banana', 'cherry']
fruits.clear()
print(fruits)  # []

fruits = ['apple', 'banana', 'cherry', 'banana']

# index()를 사용하여 요소의 인덱스 찾기
print(fruits.index('banana'))  # 1

# count()를 사용하여 요소의 개수 세기
print(fruits.count('banana'))  # 2

# sort()를 사용하여 리스트 정렬
fruits.sort()
print(fruits)  # ['apple', 'banana', 'banana', 'cherry']

# reverse()를 사용하여 리스트 뒤집기
fruits.reverse()
print(fruits)  # ['cherry', 'banana', 'banana', 'apple']
