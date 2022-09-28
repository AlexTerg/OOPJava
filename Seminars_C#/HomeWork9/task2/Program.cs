// Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N

Console.WriteLine("Введите число M\t");
int numberM = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Введите число N\t");
int numberN = Convert.ToInt32(Console.ReadLine());

Console.WriteLine(SumMtoN(numberM, numberN));

int SumMtoN(int numM, int numN)
{
    if (numM == numN)
    {
        return numN;
    }
    return numM + (SumMtoN(numM + 1, numN));
}