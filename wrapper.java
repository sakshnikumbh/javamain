public class wrapper {
    public static void main1(String... x)
    {
        byte data =123;
        Byte data2=new Byte(data);
        System.out.println(data2);

    }

    public static void main2(String... x)
    {
        byte data =12;
       String str=Byte.toString(data);
       System.out.println(str);

    }

    public static void main3(String... x)
    {
      String str="123";
      byte data=Byte.parseByte(str);
      System.out.println(data);


    }

    public static void main4(String... x)
    {
      String str="123";
      byte b1=Byte.parseByte(str);
      Byte b2=new Byte(b1);
      byte b3=b2.byteValue();
      System.out.println(b3); 


    }

    public static void main(String... x)
    {
      String str="1";
      Byte b2=Byte.valueOf(str);
      System.out.println(b2);
     


    }




}
