# 0으로 나눌 때 예외 처리 예시
try:
    # 예외가 발생할 수 있는 코드
    result = 10 / int(input("숫자를 입력하세요: "))
except ZeroDivisionError as e:
    # ZeroDivisionError 예외가 발생했을 때 실행되는 코드
    print(e)
    print("0으로 나눌 수 없습니다.")
except ValueError:
    # ValueError 예외가 발생했을 때 실행되는 코드
    print("유효한 숫자를 입력하세요.")
else:
    # 예외가 발생하지 않았을 때 실행되는 코드
    print(f"결과: {result}")
finally:
    # 예외 발생 여부와 상관없이 항상 실행되는 코드
    print("프로그램이 끝났습니다.")

# raise <Exception Type>(예외메시지)
# raise ValueError("유효하지 않은 값입니다")

# assert 조건, 메시지
assert 2 + 2 == 5, "2와 2의 합은 5가 아닙니다."

# 파일 읽기
with open('example.txt', 'r') as file:
    content = file.read()
    print(content)

# 파일 쓰기
# 파일이 존재하지 않으면 새로 생성하고, 기존 파일이 있다면 내용을 덮어쓴다.
with open('example.txt', 'w', encoding='utf8') as file:
    file.write('Hello, World!')

# 파일 추가
# 파일의 끝에 문자열을 추가한다.
with open('example.txt', 'a') as file:
    file.write('\nHello again!')

# os
import os
# 새로운 디렉토리 생성
os.mkdir('new_directory')
# 디렉토리 삭제
os.rmdir('directory_to_delete')
# 디렉토리 존재 확인
if os.path.exists('directory_name'):
    print('디렉토리가 존재합니다.')
else:
    print('디렉토리가 존재하지 않습니다.')

# pathlib
from pathlib import Path

# 새로운 디렉토리 생성
path = Path('new_directory')
path.mkdir()

# 디렉토리 삭제
path = Path('directory_to_delete')
path.rmdir()

# 디렉토리 존재 확인
path = Path('directory_name')

if path.exists():
    print('디렉토리가 존재합니다.')
else:
    print('디렉토리가 존재하지 않습니다.')


# pickle
import pickle

# 객체 생성
data = {'name': 'Alice', 'age': 30, 'city': 'Wonderland'}

# 객체를 파일에 저장 (직렬화)
with open('data.pickle', 'wb') as f:
    pickle.dump(data, f)

# 파일에서 객체 읽기 (역직렬화)
with open('data.pickle', 'rb') as f:
    restored_data = pickle.load(f)

print(restored_data)  # {'name': 'Alice', 'age': 30, 'city': 'Wonderland'}