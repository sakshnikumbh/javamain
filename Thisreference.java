import java.util.Scanner;

public class Thisreference {
    int day;
    int month;
    int year;

    public void acceptRecord()
    {
        try(Scanner scanner =new Scanner(System.in))
        {
           System.out.println("Enter the day");
           this.day=scanner.nextInt();
           System.out.println("Enter the month");
           this.month=scanner.nextInt();
           System.out.println("Enter the year");
            this.year=scanner.nextInt();
        }
 }

    public void printRecord()
    {
      System.out.println(this.day+"  / "+this.month+"  / "+this.year);
   }

    public static void main(String... x)
    {
       Thisreference this1=new Thisreference();
       this1.acceptRecord();
       this1.printRecord();
    }
}
