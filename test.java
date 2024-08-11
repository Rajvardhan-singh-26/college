interface test{
   public void square();
}
class arithmetic implements test{
    public void square(){
        System.out.println("square");
    }
}
public class ToTestint
{
    public static void main (String args[])
    {
        test t = new arithmetic();
        System.out.println(t.square());
    }

}