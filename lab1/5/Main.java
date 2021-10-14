
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        System.out.print("Enter the number of elements:");
        int number =input.nextInt();
        int arr[] = new int[number];
        System.out.print("Enter "+number+" integers:");
        for(int i=0;i<number;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.print("Enter the number to search:");
        int number1=input.nextInt();
        int d=0;
        for(int p :arr)
        {
            if(number1==p)
            {
                d++;
            }
        }
        System.out.println(number1+" occurred "+d+" times in the array.");
    }
}
