Console.Write("Введите цифру:\t");
int digit = Convert.ToInt32(Console.ReadLine());


bool FindDayOff(int num)
{
    return num == 6 || num == 7;
}

if (digit > 0 && digit < 8) Console.WriteLine(FindDayOff(digit));
else Console.WriteLine("Введите число от 1 до 7");