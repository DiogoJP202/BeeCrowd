using System;

class URI
{

    static void Main(string[] args)
    {
        string[] input = Console.ReadLine().Split(' ');
        int c = int.Parse(input[0]);
        int n = int.Parse(input[1]);
        int endPoint = c % n;
        Console.WriteLine(endPoint);
    }

}