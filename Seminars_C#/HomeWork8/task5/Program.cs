// Напишите программу, которая заполнит спирально массив 4 на 4.

int[,] array = new int[4, 4];

CreateSpiralArray(array);
PrintArray(array);

void CreateSpiralArray(int[,] arr)
{
    int i = 0;
    int j = 0;
    int digit = 1;

    while (digit <= arr.GetLength(0) * arr.GetLength(1))
    {
        arr[i, j] = digit;
        digit++;
        if (i < j && i + j >= arr.GetLength(0) - 1)
            i++;
        else if (i <= j + 1 && i + j < arr.GetLength(1) - 1)
            j++;
        else if (i >= j && i + j > arr.GetLength(1) - 1)
            j--;
        else
            i--;
    }
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