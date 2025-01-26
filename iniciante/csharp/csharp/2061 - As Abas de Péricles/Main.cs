using System;

class URI
{

    static void Main(string[] args)
    {

        string[] input = Console.ReadLine().Split(' ');
        int N = int.Parse(input[0]);
        int M = int.Parse(input[1]);

        for (int i = 0; i < M; i++)
        {
            string userAction = Console.ReadLine();
            if (userAction == "fechou")
                N += 1;
            else
                N -= 1;
        }

        Console.WriteLine(N);
    }

}