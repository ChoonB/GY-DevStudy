# https://level.goorm.io/exam/195694/%EB%B0%9C%EC%A0%84%EA%B8%B0/quiz/1
from collections import deque

def bfs(start_x, start_y, m, visited, n):
    direction = [(1, 0), (-1, 0), (0, 1), (0, -1)]
    q = deque([(start_x, start_y)])
    visited[start_x][start_y] = True
    
    while q:
        x, y = q.popleft()
        for dx, dy in direction:
            nx, ny = x + dx, y + dy
            if 0 <= nx < n and 0 <= ny < n and m[nx][ny] == 1 and not visited[nx][ny]:
                visited[nx][ny] = True
                q.append((nx, ny))


n = int(input())
m = [list(map(int, input().split())) for _ in range(n)]
visited = [[False] * n for _ in range(n)]
count = 0

for x in range(n):
		for y in range(n):
				if m[x][y] == 1 and not visited[x][y]:
						bfs(x, y, m, visited, n)
						count += 1

print(count)
