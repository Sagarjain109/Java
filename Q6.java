/*Write a program to create a “Bank” as a Superclass and perform hierarchical 
inheritance using three sub classes “SBI”, “AXIS” and “ICICI” with a dynamic 
dispatch or method overriding. */
package Assignment;
//Q6 is Bank;
public class Q6 {
    void branch(){
        System.out.println("This is the Main Branch.");
    }
    
}


class SBI extends Q6{

    void branch(){
        System.out.println("This is the Branch of Sanjay Palace.");
    }
}
class Axis extends Q6{

    void branch(){
        System.out.println("This is the branch of Fatehabad road.");
    }
}
class ICICI extends Q6{

    void branch(){
        System.out.println("This is the branch of Amar Hotel.");
    }
}
class Main{
    public static void main(String[] args) {
        //ICICI i = new ICICI();
        //i.branch();
        SBI s = new SBI();
        s.branch();
    }

}
