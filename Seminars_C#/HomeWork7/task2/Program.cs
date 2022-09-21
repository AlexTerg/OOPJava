// Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, 
// и возвращает значение этого элемента или же указание, что такого элемента нет.
Console.WriteLine("Введите первую позицию\t");
int firstPosition = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите вторую позицию\t");
int secondPosition = Convert.ToInt32(Console.ReadLine());

int[,] array = new int[3, 4];

CreateArray(array);
PrintArray(array);
SearchValueByPosition(firstPosition, secondPosition, array);

void SearchValueByPosition(int arg1, int arg2, int[,] array)
{
    if (arg1 <= array.GetLength(0) - 1
     && arg1 >= 0
     && arg2 <= array.GetLength(1) - 1
     && arg2 >= 0)
    {
        Console.WriteLine(array[arg1, arg2]);
    }
    else
    {
        Console.WriteLine($"Значение на позиции {arg1} {arg2} не найдено");
    }
}

int[,] CreateArray(int[,] array)
{
    Random rnd = new Random();
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            array[i, j] = rnd.Next(0, 11);
        }
    }
    return array;
}

void PrintArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"{array[i, j]} ");
        }
        Console.WriteLine();
    }
}
