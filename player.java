class Player{
  void Display()
  {
    System.out.println("all players are good ");
  } 
}
   class CricketPlayer extends Player{
    void display_cricket()
    {
        System.out.println("all cricket players are good");
    }
    }
    class Football_Player extends Player
    {
        void display_Football(){
            System.out.println("all football player are good");
        }
    }
    class HockeyPlayer extends Player{
        void display_Hockey(){
        System.out.println("all hockey players are good ");
    } 

}

public class Displayall{
    public static void main (String[] args)
    {
        CricketPlayer c=new CricketPlayer();
        Football_Player f=new Football_Player();
        HockeyPlayer h= new HockeyPlayer();
        f.display_Football();
        c.display_cricket();
        h.display_Hockey();
    }
}