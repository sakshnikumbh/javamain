import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDate1 {
    public static void main1(String... x) throws Exception
    {
        
        String pattern="dd/MM/yyyy";
        SimpleDateFormat d1=new SimpleDateFormat(pattern);
        String source="23/07/1909";
        Date d2=d1.parse(source);

        int date=d2.getDate();
        int month=d2.getMonth()+1;
        int year=d2.getYear()+1900;

        System.out.println(date+" "+month+" "+year);

    }

    public static void main(String... x) throws Exception
    {
       Date date=new Date();
       SimpleDateFormat sd=new SimpleDateFormat("dd/MMM/YYYY");
        String str=sd.format(date);
        System.out.println(str);
       
}
}
