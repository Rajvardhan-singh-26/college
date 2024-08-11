package q;
import p.A;

public class B {
    public static void main(String[] args) {
        A a = new A();
        a.publicMethod();
        a.protectedMethod();
        a.packagePrivateMethod();
    }
}