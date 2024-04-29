public class Methodoverloading1 {
    public void add(int a,int b)
    {
       int c = a+b;
       System.out.println(c);
    }

    public void add(int a,int b,int c)
    {
       int d=a+b+c;
       System.out.println(d);
    }
    public static void main(String... x)
    {
       Methodoverloading1 loading=new Methodoverloading1();
       loading.add(4, 5);
       loading.add(5, 5,7);
    }
}

//1 rule-when we have to give same name to method that have same types of parameters then no of parameter should be different

