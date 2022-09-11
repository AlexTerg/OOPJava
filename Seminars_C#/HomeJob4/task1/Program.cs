// Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.

Console.WriteLine("Введите первое число\t");
int FirstNmber = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите второе число\t");
int SecondNmber = Convert.ToInt32(Console.ReadLine());

int GetDegree(int number, int degree)
{
    int result = 1;
    for (int i = 0; i < degree; i++)
    {
        result *= number;
    }
    return result;
}

Console.WriteLine(GetDegree(FirstNmber, SecondNmber));