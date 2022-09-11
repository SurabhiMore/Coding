package OOPs;

class Account{
    public String name; // accessible everywhere
    protected String email; // within package & outside it thro' subclasses
    private String password;    // within class

    /* To access private variables => public methods */ 

    // getter
    public String getPassword(){
        return this.password;
    }

    // setter
    public void setPassword(String pass){
        this.password = pass;
    }

    /*
     * To access private method
     * 
     * public String getPassword(){
     *  setPassword(randomPass);
     *  return this.password;
     * }
     */
}

public class Encapsulation {
    public static void main(String args[]){
        Account acc1 = new Account();
        acc1.name = "Sakhi";
        acc1.email = "sakhi2000@gmail.com";
        // acc1.password - not accessible since private
        acc1.setPassword("sakhi@123");
        System.out.println(acc1.getPassword());
    }
}
