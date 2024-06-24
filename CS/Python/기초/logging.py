import logging

# 로그 레벨 설정 (기본값은 WARNING)
logging.basicConfig(level=logging.DEBUG)

# 로그 메시지 출력
logging.debug('This is a debug message')
logging.info('This is an info message')
logging.warning('This is a warning message')
logging.error('This is an error message')
logging.critical('This is a critical message')


# configparser
import configparser
config = configparser.ConfigParser()
config.sections()

config.read('example.cfg')
config.sections()

for key in config['SecfionOne']:
    print(key)

config['SecfionOne']['status']

import argparse

# ArgumentParser 객체 생성
parser = argparse.ArgumentParser(description='Process some integers.')

# 명령행 인자 추가
parser.add_argument('integers', metavar='N', type=int, nargs='+',
                    help='an integer for the accumulator')

parser.add_argument('--sum', dest='accumulate', action='store_const',
                    const=sum, default=max,
                    help='sum the integers (default: find the max)')

# 명령행 인자 파싱
args = parser.parse_args()

# 결과 출력
print(args.accumulate(args.integers))



