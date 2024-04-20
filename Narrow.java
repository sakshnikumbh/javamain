public class Narrow {
    public static void main(String... x)
    {
        double data=123.30;
        int data2=(int) data;    //Narrowing - here widner type is converted into narrow
        System.out.println(data2);
    }
}

// its is requied explicit conversion

//here the data lose....value after the decimal is not taken under consideration.