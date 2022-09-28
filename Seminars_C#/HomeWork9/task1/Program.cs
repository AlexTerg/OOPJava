// Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1. 
// Выполнить с помощью рекурсии.

Console.WriteLine("Введите число N\t");
int numberN = Convert.ToInt32(Console.ReadLine());

Console.Write(PrintNumbers(numberN));

string PrintNumbers(int num)
{
    if (num == 1)
    {
        return num.ToString();
    }
    return num + "," + PrintNumbers(num - 1);
}
