class Program
    {
        static void Main(string[] args)
        {
            string[] a = Console.ReadLine().Split(' ');
            int A = int.Parse(a[0]);
            int B = int.Parse(a[1]);
            int C = int.Parse(Console.ReadLine());

            B += C;

            while(B >=60)
            {
                A++;
                B -= 60;
            }

            if(A >= 24)
            {
                A -= 24;
            }

            Console.WriteLine(A + " " + B);
        }
    }