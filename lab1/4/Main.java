
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.println("1.Addition (+).");
        System.out.println("2.Subtraction (-).");
        System.out.println("3.Multiplication (*).");
        System.out.println("4. Division (/).");
        System.out.print("Enter operation number:");
        int n = input.nextInt();
        switch (n)
        {
            case 1:
                System.out.println ("The result is "+ (a+b));
                break;
            case 2:
                System.out.println ("The result is "+ (a-b));
                break;
            case 3:
                System.out.println ("The result is "+(a*b));
                break;
            case 4:
                System.out.println ("The result is "+(a/b));
                break;
        }
    }
}
