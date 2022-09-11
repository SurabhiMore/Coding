package OOPs;

// Multiple Inheritance

interface Animal{
    /*  Not possible as Interfaces can't have Constructors
    Animal(){

    } 
    abstract methods don't specify body 
    i.e. function implmentation not allowed
    void eat(){

    } */
    int eyes = 2;
    void walk();
}

interface Herbivore{
    String eats  = "grass";
}

class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

public class Interface {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
        System.out.println(Animal.eyes);
    }
}
