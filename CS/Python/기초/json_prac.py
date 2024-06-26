import json

# json 읽기
with open("json_example.json", "r", encoding="utf8") as f:
  contents = f.read()
  json_data = json.load(contents)
  print(json_data["employees"])

# json 쓰기
dict_data = {'Name' : 'Kim', 'Age' : 18, 'Class' : 'Magician'}
with open("data.json", "w") as f:
  json.dump(dict_data, f)

# OAuth
import requests
from requests_oauthlib import OAuth2

consumer_key = '확인한 consumer_key'
consumer_secret = '확인한c onsumer_secret'
access_token = '확인한 access_token'
access_token_secret= '확인한 access_token_secret'

oauth = OAuth2(client_key=consumer_key, client_secret=consumer_secret,
resource_owner_key=access_token,
resource_owner_secret=access_token_secret)

url ='https://api.twitter.com/1.1/statuses/user_timeline.json?screen_name={0}'.format('naver_d2')
r = requests.get(url=url, auth=oauth)
statuses = r.json()

for status in statuses:
  print (status['text'], status['created_at'])