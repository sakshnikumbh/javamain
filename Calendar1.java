import java.util.Calendar;
public class Calendar1 {
    public static void main(String [] x)
    {
        Calendar calendar= Calendar.getInstance();
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        int month=calendar.get(Calendar.MONTH)+1;
        int year=calendar.get(Calendar.YEAR);
        System.out.println(day+"  "+month+"  "+year);
    }  
}
