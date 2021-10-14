import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int a=input.nextInt();
        SeriesPrinter q= new SeriesPrinter();
        if(a==1) {
            int n = input.nextInt();
            q.printSeries(n);
        }
        else if(a==2)
        {
            int startIndex = input.nextInt();
            int endIndex = input.nextInt();
            q.printSeries(startIndex,endIndex);
        }
        else
        {
            int startIndex = input.nextInt();
            int endIndex = input.nextInt();
            int interval = input.nextInt();
            q.printSeries(startIndex,endIndex,interval);
        }
    }
}