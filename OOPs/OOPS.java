package OOPs;

// Blueprint for 'Pen' object
class Pen{

    // class data members

    String color;
    String type;    // ball, gel
    int count;

    // action ~ function
    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    // Polymorphism - Static - Compile time - Method Overloading
    public void printInfo(String color){ 
        System.out.println(color);
    }

    public void printInfo(int count){
        System.out.println(count);
    }

    public void printInfo(String color, String type){
        System.out.println(color+" "+type);
    }
}

// Blueprint for 'Student' object
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    /* Non-parameterized constructor
    Student(){
        System.out.println("Constructor called");
    }
    */

    /*  Parameterized constructor
    Student(String name, int age){
    //  this.objectProperty = parameter passed  
        this.name = name;
        this.age = age;
    }
    */

    // Copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    // defining simple empty constructor
    Student(){

    }
    
}

public class OOPS{
    public static void main(String args[]){     // takes string of arguments
        
        /*  
        // creating object 'pen1'
        Pen pen1 = new Pen();
         
        accessing property 'color' and method 'write' 
        from blueprint i.e. class using dot operator
        
        pen1.color = "Black";
        pen1.type = "Gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "Ballpoint";

        pen1.printColor();
        pen2.printColor();
        */

        /* Non-parametrized constructor                
        Student student1 = new Student();
        student1.name = "Riya";
        student1.age = 20;
        student1.printInfo();
        */

        /* Parametrized constructor
        Student student2 = new Student("Sam", 30);
        student2.printInfo();
        */

        /* Copy constructor
        java doesn't make default constructor 
        when copy constructor is defined
        
        Student s1 = new Student();
        s1.name = "Hash";
        s1.age = 24;
        System.out.println("Original constructor");
        s1.printInfo();

        System.out.println("Copy constructor");
        Student s2 = new Student(s1);
        s2.printInfo();
        */

        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "Gel";
        pen2.count = 10;
        pen2.printInfo(pen2.count);
        pen2.printInfo(pen2.color, pen2.type); 
    }
}