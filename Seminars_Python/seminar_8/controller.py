from views import show_menu, show_people,show_create_data, show_upd_data, show_del_data
from model import get_people,create_data, update_data, del_data, export_csv_to_json, import_to_csv
import logging


logging.basicConfig(filename='log.txt',
                    filemode='a',
                    format='%(asctime)s,%(msecs)d %(name)s %(levelname)s %(message)s',
                    datefmt='%H:%M:%S',
                    level=logging.INFO,
                    encoding='utf-8')


def main():
    select = show_menu()
    if select == 1:
        logging.info('Пользователь выбрал 1 команду')
        show_people(get_people())
    elif select == 2:
        logging.info('Пользователь выбрал 2 команду')
        data = show_create_data()
        create_data(data)
    elif select == 3:
        logging.info('Пользователь выбрал 3 команду')
        show_people(get_people())
        number, item = show_upd_data()
        update_data(number, item)
    elif select == 4:
        logging.info('Пользователь выбрал 4 команду')
        show_people(get_people())
        num = show_del_data()
        del_data(num)
    elif select == 5:
        logging.info('Пользователь выбрал 5 команду')
        export_csv_to_json()
    elif select == 6:
        logging.info('Пользователь выбрал 6 команду')
        import_to_csv()

