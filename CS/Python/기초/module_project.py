import random
import time
import urllib.request
import json

p = random.randint(1,1000)
print(p)

print(time.localtime()) # 현재시간 출력

url = "https://example.com"

# GET 요청 보내기
response = urllib.request.urlopen(url)

# 응답 받기
data = response.read()

# JSON 형식으로 파싱
user_data = json.loads(data)

print(user_data)
