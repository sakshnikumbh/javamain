public class Nonstaticfield {
    int day;
    int month;
    int year;

    static class Program
    {
        public static void main(String... x)
        {
            Nonstaticfield n1=new Nonstaticfield();
            n1.day=23;
            n1.month=3;
            n1.year=2024;

        }
    }
}
