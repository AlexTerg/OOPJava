Console.Write("Введите число:\t");
int numbers = Convert.ToInt32(Console.ReadLine());

void FindThirdNumber(int numbers)
{
    if (numbers / 100 != 0)
    {
        while (numbers / 1000 != 0) numbers = numbers / 10;
        Console.WriteLine(numbers % 10);
    }
    else Console.WriteLine("Третьей цифры нет");
}

FindThirdNumber(numbers);