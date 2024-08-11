interface perimeter {
    double pi = 3.14;
    double takeinput(double x, double y);
}

class rectangle implements perimeter {
    public double takeinput(double x, double y) {
        return (2 * (x + y));
    }
}

class circle implements perimeter {
    public double takeinput(double x, double y) {
        return (2 * pi * x);
    }
}

public class exp6_3 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        //circle.pi=31; error because variable automatically becomes final in an interface
        circle c = new circle();
        System.out.println(r.takeinput(2, 4));
        System.out.println(c.takeinput(2, 0));
}
}