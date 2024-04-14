class Nonstaticmethod
{
    private int num1;
    private int num2;

    public void printRecord(int num1,int num2)
    {
          this.num1=num1;
          this.num2=num2;
    }
    public void displayRecord()
    {
        System.out.println(num1+num2);
    }
    public static void main(String [] x)
    {
        Nonstaticmethod method=new Nonstaticmethod();
        method.printRecord(10, 20);
        method.displayRecord();

    }
}