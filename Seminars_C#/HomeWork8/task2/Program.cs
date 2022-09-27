// Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов.

int[,] array = new int[4,3];
CreateArray(array);
PrintArray(array);
int minSum = GetRowMinSum(array);
PrintRowMinSum(minSum, array);

int GetRowMinSum(int[,] array)
{
    int[] sumRowArray = new int[array.GetLength(0)];
    // int[] firstRowArray = array[0];
    int sum = 0;
    for (int i = 0; i < array.GetLength(0); i++)
    {   
        int tempSum = 0;
        for (int j = 0; j < array.GetLength(1); j++)
        {
            tempSum += array[i,j];
        }
        sumRowArray[i] = tempSum;
        sum = tempSum;
    }
    for (int i = 0; i < sumRowArray.Length; i++)
    {
        if(sumRowArray[i] < sum)
        {
            sum = sumRowArray[i];
        }
    }
    return sum;
    
}

void PrintRowMinSum(int arg, int[,] array)
{
    
    for (int i = 0; i < array.GetLength(0); i++)
    {   
        int sum = 0;
        for (int j = 0; j < array.GetLength(1); j++)
        {
            sum += array[i,j];
        }
        if (arg == sum)
        {
            Console.WriteLine($"{i + 1} строка");
        }
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