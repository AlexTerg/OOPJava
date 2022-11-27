// Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.

// Было несколько вариантов решения, оставил два

Console.WriteLine("Введите числа через запятую\t");
int[] NumbersArray = Console.ReadLine().Split(",").Select(int.Parse).ToArray();

int FindNumbersMoreZero(int[] array)
{
    int cnt = 0;
    foreach (int item in array)
    {
        if (item > 0) cnt++;
    }
    return cnt;
}

Console.WriteLine(FindNumbersMoreZero(NumbersArray));

// Еще один вариант решения.

// Console.WriteLine("Введите количество чисел\t");
// int size = Convert.ToInt32(Console.ReadLine());

// int FindNumbersMoreZero(int arg)
// {
//     int cnt = 0;
//     for (int i = 0; i < arg; i++)
//     {
//         Console.WriteLine("Введите число\t");
//         int number = Convert.ToInt32(Console.ReadLine());
//         if (number > 0)
//         {
//             cnt++;
//         }
//     }
//     return cnt;
// }

// Console.WriteLine(FindNumbersMoreZero(size));
