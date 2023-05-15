class One
{
    One(int x)
    {
        System.out.println(x);
    }
}
class Two extends One
{
    Two()
    {
        super(12);
        System.out.println("Inside child class constructor");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        One obj = new One(5);
        Two obj1 = new Two();
    }
}