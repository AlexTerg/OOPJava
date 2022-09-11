// Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе

Console.WriteLine("Введите число\t");
int number = Convert.ToInt32(Console.ReadLine());

int GetSumm(int num)
{
    int result = 0;
    while (num > 0)
    {
        int tempNum = num % 10;
        num /= 10;
        result += tempNum;
    }
    return result;
}

Console.WriteLine(GetSumm(number));