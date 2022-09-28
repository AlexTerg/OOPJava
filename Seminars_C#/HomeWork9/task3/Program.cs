// Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n.

Console.WriteLine("Введите число m\t");
int numberM = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Введите число n\t");
int numberN = Convert.ToInt32(Console.ReadLine());

Console.WriteLine(DefineFunctionAkkerman(numberM, numberN));

int DefineFunctionAkkerman(int numM, int numN)
{   
    if (numM > 0 && numN == 0) 
    {
        return DefineFunctionAkkerman(numM - 1, 1);
    }
    if (numM == 0) 
    {
        return numN + 1;
    }
    return DefineFunctionAkkerman(numM - 1, DefineFunctionAkkerman(numM, numN - 1));
}