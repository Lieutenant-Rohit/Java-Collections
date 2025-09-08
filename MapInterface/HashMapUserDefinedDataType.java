package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapUserDefinedDataType {
    public static void main(String[] args) {

        HashMap<Integer,Student> map = new HashMap<>();
        map.put(1,new Student("Alice",9.5));
        map.put(2,new Student("Bob",9.1));
        map.put(1,new Student("Alice",9.5)); //Modifies the key content or Doesn't store duplicates

        System.out.println(map);

        HashMap<Student,String> map1 = new HashMap<>();
        Student s1 = new Student("Alice", 9.2);
        Student s2 = new Student("Bob",9.1);
        Student s3 = new Student("Alice",9.2); //S1 and S3 are same person

        map1.put(s1,"Computer Science");
        map1.put(s2,"Mechanical Engineering");
        map1.put(s3,"Chemical Engineering");

        //HashMap treating different object differently. Even though s1 and s3 are same.

        for (Map.Entry<Student, String> Entry : map1.entrySet()) {
            System.out.println(Entry.getKey()+" - "+Entry.getValue());
        }


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

    @Override
    public int hashCode() {
        return Objects.hash(name,cgpa);
    }

    @Override
    //Check if two Student object are logically equal.
    //Even if they are different object, they are considered equal if their name and CGPA matches.
    public boolean equals(Object obj) {
        Student other = (Student)obj;

        return cgpa == other.getCgpa() && Objects.equals(name,other.getName());
    }
}
