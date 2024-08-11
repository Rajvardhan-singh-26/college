class Worker {
    String name;
    double salary;
    int hours;
    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getname() {
        return name;
    }
    public double getsalary() {
        return salary;
    }
    public double ComPay(int hours) {
        return 0;
    }
}
class dailyworker extends Worker {
    public dailyworker(String name, double salary) {
        super(name, salary);
    }
    public double ComPay(int hours){
        return (hours/8)*salary;
    }
}
class salariedworkers extends Worker{
    public salariedworkers(String name,double salary){
        super(name,salary);
    }
    public double ComPay(){
        return 40*salary;
    }
}
public class workers{
    public static void main(String [] args){
        dailyworker a=new dailyworker("RAM", 600);
        salariedworkers b=new salariedworkers("Shyam", 500);

        System.out.println(a.getname()+"'s weekly pay "+a.ComPay(38));
        System.out.println(b.getname()+"'s weekly pay "+b.ComPay());
    }
}