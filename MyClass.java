interface A{
    public void ram();
}
class meth1 implements A{
    public void ram()
    {
        System.out.println("radhe");

    }
}
    class meth2 implements A{
    public void ram()
    {
        System.out.println("shyam");
    }
}
public class MyClass
{
    public static void main (String []args )
    {
        A a = new meth1();
        A b = new meth2();
        a.ram();
        b.ram();
    
    
    }
}