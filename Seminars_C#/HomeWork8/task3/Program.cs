// Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.

int[,] firstArray = new int[2,2];
int[,] secondArray = new int[2,2];

CreateArray(firstArray);
CreateArray(secondArray);
PrintArray(firstArray);
Console.WriteLine();
PrintArray(secondArray);
Console.WriteLine();
PrintArray(GetProductTwoMatrix(firstArray, secondArray));

int[,] GetProductTwoMatrix(int[,] firstMatrix, int[,] secondMatrix)
{
    int[,] resultArray = new int[2,2];
    for (int i = 0; i < firstMatrix.GetLength(0); i++)
    {
        for (int j = 0; j < firstMatrix.GetLength(1); j++)
        {
            for (int k = 0; k < firstMatrix.GetLength(1); k++)
            {
                resultArray[i,j] += firstMatrix[i,k] * secondMatrix[k,j];
            }
        }
    }
    return resultArray;
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