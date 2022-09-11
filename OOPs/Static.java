package OOPs;

// for property, method, block, nested classes

class Student{
    String name;
    static String school;
}

public class Static {
    public static void main(String args[]){
        Student.school = "DYP";
        Student s1 = new Student();
        s1.name = "Raj";
        System.out.println(Student.school);
    }
}
