public class Methodload3 {
    public static void add(int a,double b)
    {
       double c=a+b;
       System.out.println(c);
    }
    public static void add(double b,int a)
    {
        double c=a+b;
       System.out.println(c);
    }

    public static void main(String... x)
    {
        Methodload3  load=new Methodload3();
        load.add(12,34.5);
        load.add(34.5,12);
    }
}
