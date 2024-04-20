public class Byte1 {


    public static void main1(String... x)
    {
        byte data=23;
        Byte data2= new Byte(data);

        System.out.println(data2);
    }

    public static void main2(String... x)
    {
        byte data=23;
        Byte data2= new Byte(data);
        byte data3=data2.byteValue();
        System.out.println(data3);

    }

    public static void main(String... x)
    {
       byte data=123;
       Byte data2=Byte.valueOf(data);
       System.out.println(data2);
       
    }
}

