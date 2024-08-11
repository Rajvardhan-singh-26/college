interface test{
   public void square();
}
class arithmetic implements test{
    public void square(){
        System.out.println("square");
    }
}
public class Totestint
{
    public static void main (String args[])
    {
        test t = new arithmetic();
        t.square();
    }

}