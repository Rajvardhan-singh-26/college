interface balance{
    void  money();
    static float (){
        
    }
}
class Ram implements balance{
    public float money(){
        return 100.00f;
    }
}
class Shyam implements balance{
    public float money(){
        return 1500.23f;
    }
}
 public class TestInterface{
    public  static void main (String args[])
    {
        balance a = new Ram();
        balance b = new Shyam();
        a.Ram();
        b.Shyam();


    }
}