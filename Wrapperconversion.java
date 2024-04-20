

public class Wrapperconversion {
    public static void main1(String [] x)
    {
       double data =3.1445;
       Double data2 =new Double(data);
       System.out.println(data2);      

    }

    public static void main2(String [] x)
    {
       double data =3.1445;
       String str =Double.toString(data);
       System.out.println(str);

    }
    public static void main3(String [] x)
    {
       double data =3.1445;
       Double data2 =new Double(data);
       double data3=data2.doubleValue(); 
       System.out.println(data3);  

    }

    public static void main4(String [] x)
    {
      String str="12345";
      double data=Double.parseDouble(str);
      System.out.println(data);
    }


    public static void main(String [] x)
    {
      String str="12345";
      Double data=Double.valueOf(str);
      System.out.println(str);
    }

  
}
