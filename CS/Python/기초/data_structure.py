a = [1,2,3,4,5]
a.append(6)
a.append(7)
print(a.pop()) # 7
print(a.pop()) # 6

b = [1,2,3,4,5]
b.append(6)
print(b.pop(0)) # 1
print(b.pop(0)) # 2

c = (1,2,3,4,5)
print(c*2)
print(len(c))
# c[0] = 3

d = set([1,2,3])
d.add(4)
d.remove(1)
d.update([1,2,5])
print(d)
e = set([1,3,5,7,9])
print(d.union(e)) # 합집합 {1, 2, 3, 4, 5, 7, 9}
print(d.intersection(e)) # 교집합 {1, 3, 5}
print(d.difference(e)) # 차집합 {2, 4}

country_code = {"america" : 1, "korea" : 82, "japan" : 81, "china" : 86}
print(country_code.items()) # dict_items([('america', 1), ('korea', 82), ('japan', 81), ('china', 86)])
print(country_code.keys()) # dict_keys(['america', 'korea', 'japan', 'china'])
print(country_code.values()) # dict_values([1, 82, 81, 86])
country_code["german"] = 49
print(country_code) # {'america': 1, 'korea': 82, 'japan': 81, 'china': 86, 'german': 49}


from collections import deque
deque_list=deque()
for i in range(5):
  deque_list.append(i)
print(deque_list) # deque([0, 1, 2, 3, 4])
deque_list.appendleft(10)
print(deque_list) # deque([10, 0, 1, 2, 3, 4])

from collections import defaultdict

text = "apple banana cherry banana apple"

# defaultdict를 사용하여 문자 출현 빈도 세기
char_counts = defaultdict(int)
for char in text:
    char_counts[char] += 1
print(char_counts)
# defaultdict(<class 'int'>, {'a': 8, 'p': 4, 'l': 2, 'e': 3, ' ': 4, 'b': 2, 'n': 4, 'c': 1, 'h': 1, 'r': 2, 'y': 1})

from collections import Counter

data = ["apple", "banana", "cherry", "banana", "apple"]

# Counter를 사용하여 데이터의 요소들의 개수 세기
data_counter = Counter(data)
print(data_counter) # Counter({'apple': 2, 'banana': 2, 'cherry': 1})

from collections import namedtuple

# 네임드 튜플 정의
Point = namedtuple('Point', ['x', 'y'])

# 네임드 튜플 인스턴스 생성
p = Point(3, 4)

# 이름으로 요소에 접근
print(p.x)  # 3
print(p.y)  # 4

