import java.util.Scanner;
public class Task2
{
    public static void main(String[] args) {
        Book Book1,Book2,Book3;
        Book1 =new Book();
        Book2 =new Book();
        Book3 =new Book();
        Book1.title = "JAVA for Beginners 3rd edition";
        Book1.author="Prof. David";
        Book1.page=537;
        Book1.price=299;
        Book1.publication="Easy Coding Publications";
        Book2.title = "Omega Point 12th edition";
        Book2.author="Humayun Ahmed";
        Book2.page=122;
        Book2.price=128;
        Book2.publication="Shomoy Prokashoni";
        Book3.title = "Digital Fortress 5th edition";
        Book3.author="Dan Brown";
        Book3.page=356;
        Book3.price=520 ;
        Book3.publication="St. Martin Press";
        Book1.showinfo();
        Book2.showinfo();
        Book3.showinfo();
        System.out.println("Book1 memory address : "+ Book1);
        System.out.println("Book2 memory address : "+ Book2);
        System.out.println("Book3 memory address : "+ Book3);
        Book1=Book3;
        Book1.title="JAVA for Beginners 1st edition";
        Book3.showinfo();
        System.out.println("Book1 memory address : "+ Book1);
        System.out.println("Book2 memory address : "+ Book2);
        System.out.println("Book3 memory address : "+ Book3);
    }
}