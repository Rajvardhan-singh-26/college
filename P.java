package P;
public class A {
    public void PublicMethod(){
        int a =  20;
        System.out.println("public method : "+a);

    }
    private void PrivateMethod(){
        int b = 30;
        System.out.println("Private Method : "+b);
    }
    protected void ProtectedMethod(){
        int c = 40;
        System.out.println("Protected methode : "+c);

    }
    void DefaultMethod(){
        int d = 50;
        System.out.println("Default Method : " +d);
    }

}