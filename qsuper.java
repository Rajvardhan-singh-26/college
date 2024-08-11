class superClass {
    private void show() 
    {
        System.out.println("50");//cant be accessed

    }
    public void display()
    {
        System.out.println("60 ");//can be acessed 
    }
}
    class derived extends superClass 
         {
            public void accessPrivate() {
        }
    }
    
    public class qsuper {
        public static void main(String[] arg){
            superClass a = new superClass ();
            derived b = new derived();
            b.display();
            //a.acessPrivate();
    }
    }
    
