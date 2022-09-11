package OOPs;


/* 
1. Single (Triangle : Shape)
2. Multilevel (EquilateralTrianlge : Triangle : Shape)]
3. Hierarchial (Circle, Trianlge : Shape) 
*/

// Base/Parent class
class Shape{

    int sides;

    public void area(){
        System.out.println("Displays area");
    }
}

// Subclass/Child/Derived class

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class Inheritance {
    public static void main(String args[]){
        
    }
}
