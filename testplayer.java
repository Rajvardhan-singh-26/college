class player {
    String name;

    void setname(String name) {
        this.name = name;
    }

    void getname() {
        System.out.println(name);
    }

    void pdisplay() {
        System.out.println("I love all sports");
    }

}

class cricket extends player {
    int sixes = 500;

    void cdisplay() {
        System.out.println("I usually play cricket");
    }

}

class football extends player {
    int goals = 900;

    void fdisplay() {
        System.out.println("I usually play football");
    }

}

class hockey extends player {
    int hgoals = 100;

    void hdisplay() {
        System.out.println("I usually play hockey");
    }

}

public class testplayer {
    public static void main(String args[]) {
        cricket a = new cricket();
        a.cdisplay();
        football f = new football();
        f.fdisplay();
        hockey h = new hockey();
        h.hdisplay();
        a.setname("MSD");
        a.getname();
        f.setname("MESSI");
        f.getname();
        h.setname("SARTAJ");
        h.getname();
        System.out.println(a.sixes);
        System.out.println(f.goals);
        System.out.println(h.hgoals);
    }
}