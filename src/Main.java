public class Main
{

    public static void main(String[] args)
    {
	for (int x = 0; x <= 30; x++)
    {
        System.out.printf("%4d", x);
    }

    System.out.println();

    for (int x = 30; x >= 0; x--)
        {
            System.out.printf("%4d", x);
        }

        System.out.println();

    for (int x = 0; x <= 18; x+= 3)
    {
        System.out.printf("%4d", x);
    }

        System.out.println();

    for (int x = 10; x >= 0; x-= 2)
    {
        System.out.printf("%4d", x);
    }

        System.out.println();

    for (int row = 0; row <= 5; row++)
    {
        for (int col = 0; col <= 5; col++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println();

    for (int row = 0; row <= 5; row++)
    {
        for (int col = 0; col <= row; col++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println();

        for (int row = 5; row >= 0; row--)
        {
            for (int col = 0; col <= row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int row = 0; row <= 5; row++)
        {
            for (int col = 0; col <= row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
