mail = "s.tergoev@ya.ru"


def VerifyMail(email):
    all_mail = ['mail.ru', 'yandex.ru', 'gmail.com', 'rambler.ru', 'ya.ru']
    temp_mail = email.lower().split("@")
    if temp_mail[-1] not in all_mail:
        print(f"{email} - не является корректным")
    else:
        return CorrectMail(temp_mail)
    


def CorrectMail(email):
    if 'yandex' in email[1]:
        email[1] = 'ya.ru'
        print(email[0] + '@' + email[1])


VerifyMail(mail)
