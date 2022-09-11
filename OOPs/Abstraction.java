package OOPs;

abstract class Animal{
    Animal(){
        System.out.println("You are creating a new Animal");
    }
    abstract void walk();
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("A horse created");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Kangaroo extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    
    public static void main(String args[]){
        Horse horse = new Horse();
        // horse.walk();
        // horse.eat();

        /* Runtime error
        Animal animal = new Animal();
        animal.walk
        - cannot instantiate animal i.e. we can't create 
        objects of abstract class
        */
    }
}
