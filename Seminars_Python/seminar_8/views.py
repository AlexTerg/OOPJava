import logging


logging.basicConfig(filename='log.txt',
                    filemode='a',
                    format='%(asctime)s,%(msecs)d %(name)s %(levelname)s %(message)s',
                    datefmt='%H:%M:%S',
                    level=logging.INFO,
                    encoding='utf-8')


def show_menu():
    while True:
        try:
            value = int(input(
                '''Выберите команду:\n1 - Просмотреть весь список сотрудников.\n2 - Добавить сотрудника.\n3 - Изменить данные сотрудника.\n4 - Удалить сотрудника.\n5 - Экспорт в json.\n6 - Импортировать данные.\n0 - Выход.\n'''))
            if value > 6:
                logging.info('Пользователь ввел число больше 6')
                print('Введите число от 1 до 6')
                continue
            elif value == 0:
                exit()
        except Exception:
            logging.info('Пользователь ввел строку')
            print('Некорректный ввод')
        else:
            break
    return value


def show_people(lst):
    print('Список всех сотрудников:\n')
    for index, item in enumerate(lst):
        if index == 0:
            print(' ', *item)
        else:
            print(index, *item)
        

def show_create_data():
    data = input('Введите Фамилию, Имя, телефон и должность через пробел.\n').split()
    return data


def show_upd_data():
    value = int(input('Выберите строку для изменения\n'))
    string = input('Введите новые данные\n').split()
    return value, string


def show_del_data():
    value = int(input('Выберите строку для удаления.\n'))
    return value

