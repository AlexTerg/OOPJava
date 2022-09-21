// Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.

int[,] array = new int[3, 4];

CreateArray(array);
PrintArray(array);
Average(array);

void Average(int[,] array)
{
    
    for (int i = 0; i < array.GetLength(0); i++)
    {   
        double sum = 0;
        for (int j = 0; j < array.GetLength(1); j++)
        {
            sum += array[i,j];
        }
        Console.Write($"{sum / array.GetLength(1)} ");
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
            Console.Write($"{array[i,j]} ");
        }
        Console.WriteLine();
    }
}
