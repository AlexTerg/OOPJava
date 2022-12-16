import csv
import json
import os

def get_people():
    with open('./file.csv', mode='r', encoding='utf-8') as file:
        reader = csv.reader(file, delimiter=';')
        return list(reader)


def create_data(lst):
    file_path = './file.csv'
    if not os.path.exists(file_path):
        with open('./file.csv', mode='a',  encoding='utf-8', newline='') as file:
            writer = csv.writer(file, delimiter=';')
            writer.writerow(['secondname', 'firstname', 'phone', 'jobtitle'])
    with open('./file.csv', mode='a',  encoding='utf-8', newline='') as file:
        writer = csv.writer(file, delimiter=';')
        writer.writerow(lst)

def update_data(num, string):
    try:
        with open('./file.csv', mode='r', encoding='utf-8') as file:
            reader = csv.reader(file, delimiter=';')
            data = list(reader)
            data[num] = string
        with open('./file.csv', mode='w', newline='',  encoding='utf-8') as file:
            writer = csv.writer(file, delimiter=';')
            for i in data:
                writer.writerow(i)
    except IndexError:
        print('Вышли за предел массива')
    


def del_data(num):
    with open('./file.csv', mode='r', encoding='utf-8') as file:
        reader = csv.reader(file, delimiter=';')
        data = list(reader)
        del data[num]
    with open('./file.csv', mode='w', newline='',  encoding='utf-8') as file:
        writer = csv.writer(file, delimiter=';')
        for i in data:
            writer.writerow(i)


def export_csv_to_json():
    with open('./file.csv', encoding='utf-8') as csvfile:
        reader = csv.DictReader(csvfile, delimiter=';')
        expensive = sorted(reader, key=lambda x: x['firstname'], reverse=True)
    with open('./file.json', 'w', encoding='utf-8', newline='') as jsonfile:
        json.dump(expensive, jsonfile, ensure_ascii=False, indent=4)


def import_to_csv():
    with open('./file.json', 'r', encoding='utf-8') as jsonfile:
        data = jsonfile.read()
    jsondata = json.loads(data)
    with open('./file.csv', 'a', encoding="utf8", newline='') as file:
        writer = csv.DictWriter(file, fieldnames=jsondata[0].keys(), delimiter=';')
        writer.writerows(jsondata)
