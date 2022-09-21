// Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.
// m = 3, n = 4.

double[,] array = new double[3, 4];

CreateArray(array);
PrintArray(array);

double[,] CreateArray(double[,] array)
{   
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {   
            int randomIntNum = new Random().Next(-15, 15);
            double randomDoubleNum = new Random().NextDouble();
            array[i, j] = Math.Round(randomDoubleNum * randomIntNum, 1);
        }
    }
    return array;
}

void PrintArray(double[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"{array[i,j]} ");
        }
        Console.WriteLine();
    }
}
