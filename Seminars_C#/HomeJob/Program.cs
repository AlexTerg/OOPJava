Console.WriteLine("Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.");
Console.Write("Введите первое число ");
int firstNumber = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите второе число ");
int secondNumber = Convert.ToInt32(Console.ReadLine());

if (firstNumber > secondNumber)
{
    Console.WriteLine($"{firstNumber} больше чем {secondNumber}");
}
else if (firstNumber < secondNumber)
{
    Console.WriteLine($"{secondNumber} больше чем {firstNumber}");
}
else
{
    Console.WriteLine($"число {firstNumber} равно числу {secondNumber}");
}

Console.WriteLine("----------------------------");
Console.WriteLine("Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.");
Console.Write("Введите первое число ");
int numberFirst = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите второе число ");
int numberSecond = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите третье число ");
int numberThrid = Convert.ToInt32(Console.ReadLine());

if (numberFirst > numberSecond && numberFirst > numberThrid)
{
    Console.WriteLine($"max number = {numberFirst}");
}
else if (numberSecond > numberFirst && numberSecond > numberThrid)
{
    Console.WriteLine($"max number = {numberSecond}");
}
else
{
    Console.WriteLine($"max number = {numberThrid}");
}

Console.WriteLine("----------------------------");
Console.WriteLine("Напишите программу, которая на вход принимает число и выдаёт, является ли число чётным.");

Console.Write("Введите число ");
int digit = Convert.ToInt32(Console.ReadLine());

if (digit % 2 == 0)
{
    Console.WriteLine($"{digit} четное число");
}
else
{
    Console.WriteLine($"{digit} нечетное число");
}

Console.WriteLine("----------------------------");
Console.WriteLine("Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N.");

Console.Write("Введите число ");
int number_N = Convert.ToInt32(Console.ReadLine());
int cnt = 2;
while (cnt <= number_N)
{
    Console.Write($"{cnt} ");
    cnt += 2;
}

