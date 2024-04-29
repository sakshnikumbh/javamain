public class Returnoverloading {
    public static int add(int a)
    {
        
       return a;
    }
    public static char add(char ch)
    {
       return 'a';
    }

    public static void main(String... x)
    {
       System.out.println(Returnoverloading.add(2));
       System.out.println(Returnoverloading.add('a'));
    }
}
