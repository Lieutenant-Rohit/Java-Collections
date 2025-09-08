public class Employee
{
    private String name;
    private int age;
    private double salary;
    double hra;
    double da;
    double pf;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void calculation()
    {
        hra = 0.10*salary;
        da  = 0.25*salary;
        pf  = 0.15*salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", hra=" + hra +
                ", da=" + da +
                ", pf=" + pf +
                '}';
    }
}

class Main
{
    public static void main(String[] args) {

        Employee e1 = new Employee("Rohit",23, 100000);
        e1.calculation();
        System.out.println(e1);
    }
}
