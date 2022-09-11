Console.Write("Введите трехзначное число:\t");
int numbers = Convert.ToInt32(Console.ReadLine());

int FindSecondNumber(int numbers)
{
    return numbers / 10 % 10;
}

Console.WriteLine(FindSecondNumber(numbers));