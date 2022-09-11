//  Напишите программу, которая принимает на вход координаты двух точек и 
//  находит расстояние между ними в 3D пространстве.

Console.WriteLine("Введите точку x1\t");
int x1 = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите точку y1\t");
int y1 = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите точку z1\t");
int z1 = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите точку x2\t");
int x2 = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите точку y2\t");
int y2 = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите точку z2\t");
int z2 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine(GetLength(x1, y1, z1, x2, y2, z2));

double GetLength(int x1, int y1, int z1, int x2, int y2, int z2)
{
    double length = Math.Round(Math.Sqrt(Math.Pow(x2 - x1, 2) + Math.Pow(y2 - y1, 2) + Math.Pow(z2 - z1, 2)), 2);
    return length;
}