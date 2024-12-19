using System; 

class URI {

    static void Main(string[] args) { 

        int p1 = int.Parse(Console.ReadLine());
        int p2 = int.Parse(Console.ReadLine());
        int p3 = int.Parse(Console.ReadLine());
        int p4 = int.Parse(Console.ReadLine());
        int p5 = int.Parse(Console.ReadLine());
        
        p1 *= 300;
        p2 *= 1500;
        p3 *= 600;
        p4 *= 1000;
        p5 *= 150;
        
        int total = p1 + p2 + p3 + p4 + p5 + 225;
        
        Console.WriteLine(total);
    }

}