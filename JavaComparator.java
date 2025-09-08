import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class JavaComparator {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Alice",9.3));
        list.add(new Student("Bob",8.3));
        list.add(new Student("Tom",7.1));
        list.add(new Student("Jerry",8.5));
        list.add(new Student("Raju",6.1));
        list.add(new Student("Bheem",8.3));
        list.add(new Student("Zek",8.3));
        System.out.println(list);
        Comparator<Student> comparator = Comparator.comparing(Student::getCgpa).reversed().thenComparing(Comparator.comparing(Student::getName).reversed());
        list.sort(comparator);
        System.out.println(list);

        Object[] arr = list.toArray();
        for(Object object : arr)
            System.out.println(object);
    }
}

class Student{
    private String name;
    private double cgpa;

    public Student(String name, double cgpa) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}