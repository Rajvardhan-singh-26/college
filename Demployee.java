class Employee {
    String name;
    int empid;
    double salary;

    // default cons
    public Employee() {
        name = "Ram";
        empid = 56889;
        salary = 10000000;
    }

    // parameterised cons
    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }
    public String getname() {
        return name;
    }
    public int getempid() {
        return empid;
    }
    public double getsalary() {
        return salary;
    }
    public void increasesalary(double percentage) {
        salary += salary * (percentage / 100.0);
    }
}
class Manager extends Employee {
    String department;
    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }
    public String getdepartment() {
        return department;
    }
}
public class Demployee {
    public static void main(String [] args){
        Employee a=new Employee("Ram",56889,1000000);
        Manager b=new Manager("Kamal", 5677, 100000, "data science");
        System.out.println("employee details are\nname "+a.getname() +"\nempid " + a.getempid() + "\nsalary "+ a.getsalary());
        System.out.println("manager details are"+b.getname()+ b.getempid() + b.getsalary() +b.getdepartment());
        a.increasesalary(5);
        b.increasesalary(10);
        System.out.println("After Increasing Salary:");
        System.out.println("Employee Salary: Rs." + a.getsalary());
        System.out.println("Manager Salary: Rs." + b.getsalary());
}
}