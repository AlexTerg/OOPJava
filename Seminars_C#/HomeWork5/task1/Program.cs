// Задайте массив заполненный случайными положительными трёхзначными числами. 
// Напишите программу, которая покажет количество чётных чисел в массиве.

int[] CreateArray()
{
    Random rnd = new Random();
    int[] array = new int[rnd.Next(10, 20)];
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = rnd.Next(100, 1000);
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

int EvenSearch(int[] array)
{
    int cnt = 0;
    foreach (var item in array)
    {
        if (item % 2 == 0) cnt++;
    }
    return cnt;
}


int[] arr = CreateArray();
PrintArray(arr);
Console.WriteLine();
Console.WriteLine(EvenSearch(arr));