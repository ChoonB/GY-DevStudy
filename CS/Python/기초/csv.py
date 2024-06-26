import csv
import os

# 파일 읽기
file_path = os.path.join('datahandling', 'customers.csv')

data_header = []
customer_list = []

with open(file_path, 'r', newline='') as customer_data:
    reader = csv.reader(customer_data)
    line_counter = 0
    for row in reader:
        if line_counter == 0:
            data_header = row
        else:
            customer_list.append(row)
        line_counter += 1

print("Header:\t", data_header)
for i in range(min(10, len(customer_list))):
    print(f"Data {i}:\t", customer_list[i])
print("Total customers:", len(customer_list))

# 파일 쓰기
file_path = os.path.join('datahandling', 'customers.csv')
output_file_path = "customers_USA_only.csv"

data_header = []
customer_USA_only_list = []

with open(file_path, 'r', newline='') as customer_data:
    reader = csv.reader(customer_data)
    data_header = next(reader)  # 첫 번째 행을 헤더로 설정

    for row in reader:
        if row[10].upper() == "USA":
            customer_USA_only_list.append(row)

print("Header:\t", data_header)
for i in range(min(10, len(customer_USA_only_list))):
    print(f"Data:\t", customer_USA_only_list[i])
print("Total customers in USA:", len(customer_USA_only_list))

with open(output_file_path, 'w', newline='') as customers_USA_only_csv:
    writer = csv.writer(customers_USA_only_csv)
    writer.writerow(data_header)
    for customer in customer_USA_only_list:
        writer.writerow(customer)

print(f"Data written to {output_file_path}")
