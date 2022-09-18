// Напишите программу, которая найдёт точку пересечения двух прямых, заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; 
// значения b1, k1, b2 и k2 задаются пользователем.

Console.WriteLine("Введите значение b1\t");
int b1 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Введите значение k1\t");
int k1 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Введите значение b2\t");
int b2 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Введите значение k2\t");
int k2 = Convert.ToInt32(Console.ReadLine());

// k1 * x + b1 = k2 * x + b2
// (k1 - k2) * x = b2 - b1
// x = (b2 - b1) / (k1 - k2) 

double FindY(double b1, double k1, double b2, double k2)
{
   double x = (b2 - b1) / (k1 - k2);
   return k1 * x + b1;
}

double y = FindY(b1, k1, b2, k2);
Console.WriteLine($"({y};{y})");