import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        for(int i=1;i<=10;i++)
        {
            int number =input.nextInt();
            if(number>=0)
            {
                System.out.println("Positive");
            }
            else
            {
                System.out.println("Negetive");
            }
        }
    }
}
