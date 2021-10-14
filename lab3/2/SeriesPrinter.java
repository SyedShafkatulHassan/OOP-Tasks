import java.util.Scanner;
class SeriesPrinter {
    void printSeries (int n)
    {
        for(int i=0;i<=n;i++)
        {
            System.out.print(i);
            System.out.print(" ");
        }
    }
    void printSeries(int startIndex, int endIndex)
    {
        for(int i=startIndex;i<=endIndex;i++)
        {
            System.out.print(i);
            System.out.print(" ");
        }
    }
    void printSeries(int startIndex, int endIndex, int interval)
    {
        for(int i=startIndex;i<=endIndex;)
        {
            System.out.print(i);
            System.out.print(" ");
            i=i+interval;
        }
    }

}
