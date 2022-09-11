// Напишите программу, которая принимает на вход число (N) 
// и выдаёт таблицу кубов чисел от 1 до N

Console.WriteLine("Введите число N\t");
int numberN = Convert.ToInt32(Console.ReadLine());
GetSquare(numberN);

void GetSquare(int numN)
{
    int cnt = 1;
    while (cnt <= Math.Abs(numN))
    {
        Console.Write($"{Math.Pow(cnt, 3)} ");
        cnt++;
    }
}