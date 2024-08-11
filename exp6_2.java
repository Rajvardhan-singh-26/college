interface A{
    void meth1();
    void meth2();
    }
    
    public class exp6_2 implements A {
        public void meth1(){
            System.out.println("Ram");
        }
        public void meth2(){
            System.out.println("Shyam");
        }
    
        public static void main(String args[]){
          exp6_2 a= new exp6_2();
          a.meth1();
          a.meth2();
 }
    }