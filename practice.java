//1 question
import java.util.*;

class practice
{
    static public float average(int a, int b, int c)
    {
        float avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("a:");
        int a = sc.nextInt();
        System.out.print("b:");
        int b = sc.nextInt();
        System.out.print("c:");
        int c = sc.nextInt();

        float avg = average(a, b, c);
        System.out.println("Average of three numbers is:"+ avg);
    }
} 