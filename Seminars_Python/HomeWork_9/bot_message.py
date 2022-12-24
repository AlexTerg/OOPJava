import csv
from telegram.ext import ConversationHandler
from model import open_phonebook, del_data, find_data


def start(update, context):
    update.message.reply_text(
        'Выберете команду:\
        \n/show - Показать справочник\
        \n/add - Добавить запись\
        \n/del - Удалить запись\
        \n/find - Найти запись')
    return ConversationHandler.END


def bot_message_create_data(update, context):
    update.message.reply_text(
        f'Введите фамилию, имя, номер телефона и описание через пробел')
    return 1


def create_data(update, context):
    data = update.message.text.split()
    with open('file.csv', mode='a', encoding='utf-8', newline='') as file:
        write = csv.writer(file, delimiter=';')
        write.writerow(data)
    update.message.reply_text(
        f'Запись успешно добавлена')
    return ConversationHandler.END


def stop(update, context):
    update.message.reply_text("Всего доброго!")
    return ConversationHandler.END


def show_phonebook(update, context):
    text = open_phonebook()
    update.message.reply_text(text)
    return ConversationHandler.END


def bot_message_del_data(update, context):
    text = open_phonebook()
    update.message.reply_text(
        f'Для удаления записи выберите ее номер.\n\n{text}')
    return 1


def bot_message_del_number(update, context):
    number = int(update.message.text)
    if del_data(number):
        update.message.reply_text(
            f'Запись №{number} успешно удалена')
    else:
        update.message.reply_text(f'Запись под номером {number} не существует')
    return ConversationHandler.END


def bot_message_find_data(update, context):
    update.message.reply_text(
        'Для поиска записи введите фамилию')
    return 1


def show_find_data(update, context):
    name = update.message.text
    find_name = find_data(name)
    if find_name:
        update.message.reply_text(f'Поиск по фамилии {name}:\n\n{find_name}')
    else:
        update.message.reply_text('Не найдено.')
    return ConversationHandler.END

def noname(update, context):
    update.message.reply_text('Такой команды нет.\
    \n/start для списка команд')
    return ConversationHandler.END

# def main():
#     updater = Updater(TOKEN)
#     dp = updater.dispatcher
#     calc_handler = ConversationHandler(
#         entry_points=[CommandHandler('calc', calc)],

#         states={
#             1: [MessageHandler(Filters.text & ~Filters.command, calculate)]
#         },


#         # Точка прерывания диалога. В данном случае — команда /stop.
#         fallbacks=[CommandHandler('stop', stop)]
#     )

#     conv_handler = ConversationHandler(
#         entry_points=[CommandHandler('conv', conv)],

#         states={
#             # Функция читает ответ на первый вопрос и задаёт второй.
#             1: [MessageHandler(Filters.text & ~Filters.command, converter)]
#         },


#         # Точка прерывания диалога. В данном случае — команда /stop.
#         fallbacks=[CommandHandler('stop', stop)]
#     )

#     create_handler = ConversationHandler(
#         entry_points=[CommandHandler('add', bot_message_create_data)],

#         states={
#             1: [MessageHandler(Filters.text & ~Filters.command, create_data)]
#         },

#         fallbacks=[CommandHandler('stop', stop)]
#     )

#     del_handler = ConversationHandler(
#         entry_points=[CommandHandler('del', bot_message_del_data)],

#         states={
#             1: [MessageHandler(Filters.text & ~Filters.command, bot_message_del_number)],
#         },

#         fallbacks=[CommandHandler('stop', stop)]
#     )

#     find_handler = ConversationHandler(
#         entry_points=[CommandHandler('find', bot_message_find_data)],

#         states={
#             1: [MessageHandler(Filters.text & ~Filters.command, show_find_data)],
#         },

#         fallbacks=[CommandHandler('stop', stop)]
#     )

#     noname_handler = MessageHandler(Filters.command, noname)
#     start_handler = CommandHandler('start', start)
#     show_handler = CommandHandler('show', show_phonebook)

#     dp.add_handler(create_handler)
#     dp.add_handler(start_handler)
#     dp.add_handler(calc_handler)
#     dp.add_handler(conv_handler)
#     dp.add_handler(show_handler)
#     dp.add_handler(del_handler)
#     dp.add_handler(find_handler)
#     dp.add_handler(noname_handler)
#     updater.start_polling()
#     updater.idle()


# if __name__ == '__main__':
#     main()
