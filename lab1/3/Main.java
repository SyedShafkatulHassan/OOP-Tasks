import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        int number =input.nextInt();
        int a=number-1;
        int b=1;
        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print("  ");
            }
            a--;
            for(int j=1;j<=b;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
            b++;
        }
    }
}
