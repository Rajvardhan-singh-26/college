class Player{
    String name;
    int age;
    public Player(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void play(){
        System.out.println(name + " playing");
    }

  void Display()
  {
    System.out.println("player name is " + name +" \n player age is " + age );
  } 
}
   class CricketPlayer extends Player{
    public CricketPlayer(String name, int age)
    {
        super(name, age);
    }
        public void  play(){
        System.out.println(super.getName() +" plays cricket well");
    }
    }
    class Football_Player extends Player
    {
        public Football_Player(String name , int age){
            super(name, age);
        }
        public void play(){
            System.out.println( super.getName() + " not plays football well");
        }
    }
    class HockeyPlayer extends Player{
        public HockeyPlayer(String name, int age){
            super(name, age);
        }
        public void play(){
        System.out.println(super.getName() +"plays hockey well");
    } 

}

public class Displayall{
    public static void main (String[] args)
    {
        CricketPlayer c=new CricketPlayer("RAM",50);
        Football_Player f=new Football_Player("Suresh",70);
        HockeyPlayer h= new HockeyPlayer("geeta",56);
        f.display();
        f.play();
        c.display();
        c.play();
        h.display();
        h.play();
    }
}