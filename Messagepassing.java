import java.util.Scanner;

public class Messagepassing {

    int day;
    int month;
    int year;

  public void acceptRecord()
    {
    try(Scanner scanner =new Scanner(System.in))
    {
        System.out.println("Enter the day:");
        int date=scanner.nextInt();
        System.out.println("Enter the month:");
        int month=scanner.nextInt();
        System.out.println("Enter the year:");
        int year=scanner.nextInt();
    }
    
    }

    public void printRecord()
    {
        System.out.println(day+" / "+month+" / "+year);
    }
    public static void main(String... x)
    {
       Messagepassing message=new Messagepassing();
       message.acceptRecord();
       message.printRecord();  // 0,0,0  becoz we does not use this reference  
    }
}
