import java.util.ArrayList;
import java.util.List;

public class JavaComparable {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Alice",8.3));
        list.add(new Person("Bob",8.8));
        list.add(new Person("Tom",7.9));
        list.add(new Person("Jerry",9.9));

        list.sort(null);
        System.out.println(list);
    }


}

class Person implements Comparable<Person>{
    private String name;
    private double cgpa;

    public Person(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(o.getCgpa(),this.getCgpa());
    }
}