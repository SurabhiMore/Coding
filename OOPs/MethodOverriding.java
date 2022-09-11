package OOPs;

class A{
    public void meth(){
        System.out.println("Method from class A");
    }
}

class B extends A{
    @Override
    public void meth(){
        System.out.println("Method from class B");
    }
}

public class MethodOverriding {
    public static void main(String args[]){
        A a = new A();
        a.meth(); 
        B b = new B();
        b.meth();
    }
}
