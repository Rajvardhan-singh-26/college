class super1 {
    private void show()
    {
        System.out.println("30");
    }
    class derived extends super1 {
        public void display() {
            System.out.println("54");
        }
    }
    
    public class super2{
        public static void main(String[] arg){
            derived a=new derived();
            a.show();
    }
    }
    
}