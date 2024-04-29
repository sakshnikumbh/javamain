public class Methodoverload2 {
    public static void add(int a,int b)
    {
       int c=a+b;
       System.out.println(c);
    }
    public static void add(int a,double b)
    {
        double c=a+b;
       System.out.println(c);
    }

    public static void main(String... x)
    {
      Methodoverload2 load=new Methodoverload2();
      Methodoverload2.add(5,4);
      Methodoverload2.add(3, 12.5);
    }
   
}
