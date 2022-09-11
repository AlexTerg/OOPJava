// Напишите программу, которая принимает на вход пятизначное число и 
// проверяет, является ли оно палиндромом.

Console.WriteLine("Введите пятизначное число\t");
int number = Convert.ToInt32(Console.ReadLine());

Console.WriteLine(Proverka(number));


// bool GetPalindrome(int num)
// {
//     string numString = Convert.ToString(num);
//     string numReverse = string.Empty;
//     for (int i = numString.Length - 1; i >= 0; i--)
//     {
//         numReverse += numString[i];
//     }
//     // int numInt = Convert.ToInt32(numReverse);
//     return numString == numReverse;
// }

int GetReverseNumber(int num)
{
    int numReverse = 0;
    int tempNum = 0;
    while (num > 0)
    {
        tempNum = num % 10;
        numReverse = (numReverse + tempNum) * 10;
        num /= 10;
    }
    return numReverse / 10;
}

bool Proverka(int num)
{
    return num == GetReverseNumber(num);
}

