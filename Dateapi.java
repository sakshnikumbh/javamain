import java.util.Date;

public class Dateapi {
    public static void main(String [] x)
    {
        Date date= new Date();
        int dat=date.getDate();
        int month=date.getMonth()+1;
        int year=date.getYear()+1900;
        System.out.println(dat+"  "+month+"  "+year);


    }
}
