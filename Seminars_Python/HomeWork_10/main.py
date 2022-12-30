from random import randint
from bot_token import token
import logging

from telegram import ReplyKeyboardMarkup, ReplyKeyboardRemove
from telegram.ext import Updater, CommandHandler, ConversationHandler, MessageHandler, Filters


reply_keyboard = [['/play', '/settings'],
                  ['/rules', '/close']]

candies = 200
step = 28
markup = ReplyKeyboardMarkup(reply_keyboard, one_time_keyboard=False)

logging.basicConfig(
    format='%(asctime)s - %(name)s - %(levelname)s - %(message)s', level=logging.DEBUG
)

logger = logging.getLogger(__name__)

TOKEN = token

def start(update, context):
    name = f"{update.message.from_user.first_name} {update.message.from_user.last_name}"
    update.message.reply_text(
        f"Привет, {name}! Давай поиграем? Чтобы узнать правила игры нажми /rules",
        reply_markup=markup
    )


def close_keyboard(update, context):
    update.message.reply_text(
        "Ok",
        reply_markup=ReplyKeyboardRemove()
    )

def rules(update, context):
    update.message.reply_text(
        "В начале игры нужно определить количество конфет на кону и количество конфет, "
        "которое можно взять за один раз ")


def settings(update, context):
    update.message.reply_text("Введите количество конфет на кону и максимально возможное количество на ход (Через пробел!)")
    return 1

def set_settings(update, context):
    global candies
    global step
    candies, step = map(int, update.message.text.split())
    update.message.reply_text("Правила установлены, начинаем!")
    return ConversationHandler.END

def play(update, context):
    update.message.reply_text(f"На кону {candies} конфет. Ваш ход. Какое количество конфет вы берете?"
                              f"(Максимальное = {step} )", reply_markup=ReplyKeyboardRemove())
    return 1

def is_bot(candys):
    global step
    lose_numbers = [i * (step + 1) for i in range(1, candys // step + 1)]
    for i in range(candys - (step + 1), candys + 1):
        if candys in lose_numbers:
            return randint(1, step)
        elif i % (step + 1) == 0:
            return candys - i

def play_step(update, context):
    global candies
    try:
        candiy = int(update.message.text)
    except Exception:
        update.message.reply_text('Введите число')

    if 0 < candiy < step + 1:
        candies -= candiy
        update.message.reply_text(f"Вы взяли {candiy}шт.\nОсталось {candies} конфет")
        if candies < 1:
            update.message.reply_text("Поздравляю, ты победил!", reply_markup=markup)
            candies = 200
            return ConversationHandler.END
        bot_candy = is_bot(candies)
        candies -= bot_candy
        update.message.reply_text(f'Я беру {bot_candy}шт.\nОсталось {candies} конфет')
        if candies == 0:
            update.message.reply_text('Ура! Я победил!', reply_markup=markup)
            candies = 200
            return ConversationHandler.END
    else:
        update.message.reply_text(f'Возьмите конфеты от 1 до {step}')

def stop(update, context):
    update.message.reply_text("Всего доброго!")
    return ConversationHandler.END

def main():
    updater = Updater(TOKEN)
    dp = updater.dispatcher
    settings_hundler = ConversationHandler(
        entry_points=[CommandHandler('settings', settings)],
        states={
            1: [MessageHandler(Filters.text & ~Filters.command, set_settings)]
        },
        fallbacks=[CommandHandler('stop', stop)]
    )

    play_hundler = ConversationHandler(
        entry_points=[CommandHandler('play', play)],
        states={
            1: [MessageHandler(Filters.text & ~Filters.command, play_step)]
        },
        fallbacks=[CommandHandler('stop', stop)]
    )

    dp.add_handler(CommandHandler("start", start))
    dp.add_handler(CommandHandler("rules", rules))
    dp.add_handler(settings_hundler)
    dp.add_handler(play_hundler)


    dp.add_handler(CommandHandler("close", close_keyboard))


    updater.start_polling()
    updater.idle()


if __name__ == '__main__':
    main()