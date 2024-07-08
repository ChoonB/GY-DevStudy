# 인공지능 청소기
# https://level.goorm.io/exam/43068/1a-%EC%9D%B8%EA%B3%B5%EC%A7%80%EB%8A%A5-%EC%B2%AD%EC%86%8C%EA%B8%B0/quiz/1
def can_reach(x, y, n):
    distance = abs(x) + abs(y)
    if distance <= n and (n - distance) % 2 == 0:
        return "YES"
    else:
        return "NO"

t = int(input())
results = []

for _ in range(t):
    x, y, n = map(int, input().split())
    results.append(can_reach(x, y, n))

for result in results:
    print(result)
