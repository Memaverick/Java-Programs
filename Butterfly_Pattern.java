import java.util.*;

class Butterfly_Pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //To Take number of lines to be print
        System.out.print("N:");   
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            int spaces = 2*(n-i);
            for(int j = 1; j <= spaces; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            int spaces = 2*(n-i);
            for(int j = 1; j <= spaces; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}