class Worker {
    String name;
    double salaryrate;
    int hours;

    public Worker(String name, double salaryrate) {
        this.name = name;
        this.salaryrate = salaryrate;
    }

    public String getname() {
        return name;
    }

    public double getsalaryrate() {
        return salaryrate;
    }

    public double ComPay(int hours) {
        return 0;
    }
}

class dailyworker extends Worker {
    public dailyworker(String name, double salaryrate) {
        super(name, salaryrate);
    }
    public double ComPay(int hours){
        return (hours/8)*salaryrate;
    }
}

class salariedworkers extends Worker{
    public salariedworkers(String name,double salaryrate){
        super(name,salaryrate);
    }
    public double ComPay(){
        return 40*salaryrate;
    }
}

public class Testworker{
    public static void main(String [] args){
        dailyworker a=new dailyworker("raju", 200);
        salariedworkers b=new salariedworkers("rohan", 200);

        System.out.println(a.getname()+"'s weekly pay "+a.ComPay(38));
        System.out.println(b.getname()+"'s weekly pay "+b.ComPay());
    }
}