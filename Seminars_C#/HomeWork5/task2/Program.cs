// Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.

int[] CreateArray()
{
    Random rnd = new Random();
    int[] array = new int[10];
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = rnd.Next(-10, 11);
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

int GetSum(int[] array)
{
    int sum = 0;
    for (int i = 1; i < array.Length; i += 2)
    {
        sum += array[i];
    }
    return sum;
}

int[] array = CreateArray();
PrintArray(array);
Console.WriteLine();
Console.WriteLine(GetSum(array));
