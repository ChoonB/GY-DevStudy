# 내장 함수
# sum 함수
list1 = [10,2,8,4,6]
sum_result = sum(list1)
print(sum_result) # 30

# min, max
print(min(list1)) # 2
print(max(list1)) # 10

# sorted
sorted_list = sorted(list1)
print(sorted_list) # [2, 4, 6, 8, 10]
sorted_list = sorted(list1, key=lambda x:-x)
print(sorted_list) # [10, 8, 6, 4, 2]

# 그외
print(len(list1)) # 5
print("Answer is {}.".format(eval('7+3*6-4^2'))) # Answer is 23.

# ************************

# itertools
# 순열
from itertools import permutations
data = ['Q', 'W', 'E']
print(list(permutations(data, 3)))
# [('Q', 'W', 'E'), ('Q', 'E', 'W'), ('W', 'Q', 'E'), ('W', 'E', 'Q'), ('E', 'Q', 'W'), ('E', 'W', 'Q')]

# 조합
from itertools import combinations
print(list(combinations(data, 2))) # [('Q', 'W'), ('Q', 'E'), ('W', 'E')]

# **********************

# heapq
# 기본적으로 최소힙(오름차순 정렬)
import heapq
heap = []
heapq.heappush(heap, 3)
heapq.heappush(heap, 1)
heapq.heappush(heap, 5)
heapq.heappush(heap, 2)
print(heap) # [1, 2, 5, 3]

smallest = heapq.heappop(heap)
print(smallest) # 1
print(heap) # [2, 3, 5]

# 최대힙으로 사용하려면 요소를 넣을때 -1을 곱해서 넣고 뺄 때 다시 -1을 곱해준다.

# ***************************

# bisect 이진탐색
from bisect import bisect_left, bisect_right
list2 = [1,5,7,13,25,25,33,45]
print(bisect_left(list2, 25)) # 4
print(bisect_right(list2, 25)) # 6
import bisect
bisect.insort_left(list2, 22) # 삽입
print(list2) # [1, 5, 7, 13, 22, 25, 25, 33, 45]

# *******************************
# deque
from collections import deque
list3 = [2,3,4]
dq = deque(list3)

dq.append(7)
dq.appendleft(1)
print(dq) # deque([1, 2, 3, 4, 7])

print(dq.pop()) # 7
print(dq.popleft()) # 1
print(dq) # deque([2, 3, 4])

# **********************************
# Counter
from collections import Counter
list4 = ['a', 'b', 'a', 'a', 'a', 'c', 'b', 'e', 'e', 'd', 'a']
c = Counter(list4)
print(c["a"]) # 5
print(dict(c)) # {'a': 5, 'b': 2, 'c': 1, 'e': 2, 'd': 1}

# ***************************
# math
import math
print(math.factorial(6)) # 720
print(math.sqrt(36)) # 6.0
print(math.gcd(49, 35)) # 7