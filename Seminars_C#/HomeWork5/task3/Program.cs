// Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.

int[] CreateArray()
{
    Random rnd = new Random();
    int[] array = new int[10];
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = rnd.Next(0, 50);
    }
    return array;
}

void PrintArray(int[] array)
{
    foreach (var item in array)
    {
        Console.Write($"{item} ");
    }
}

int FindDiffMaxMin(int[] array)
{
    int maxNumber = array[0];
    int minNumber = array[0];
    for (int i = 1; i < array.Length; i++)
    {
        if (maxNumber < array[i]) maxNumber = array[i];

        else if (minNumber > array[i]) minNumber = array[i];
    }
    return maxNumber - minNumber;
}

int[] arr = CreateArray();
PrintArray(arr);
Console.WriteLine();
Console.WriteLine(FindDiffMaxMin(arr));
