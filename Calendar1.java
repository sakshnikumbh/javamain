import java.util.Calendar;
public class Calendar1 {
    public static void main(String [] x)
    {
        Calendar calendar= Calendar.getInstance();
        
        int day=calendar.get(Calendar.DATE);
        int month=calendar.get(Calendar.MONTH)+1;
        int year=calendar.get(Calendar.YEAR);
        System.out.println(day+"  "+month+"  "+year);

        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int min=calendar.get(Calendar.MINUTE);
        int second=calendar.get(Calendar.SECOND);
        int milli=calendar.get(Calendar.MILLISECOND);
        int a=calendar.get(Calendar.AM);


        System.out.println(hour+"  "+min+"  "+second+" "+milli+"  "+a);
        
    }  
}
