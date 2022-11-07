/*
 * Suppose a class 'A' has a static method to print "Parent". Its subclass 'B' also has 
a static method with the same name to print "Child". Now call this method by the 
objects of the two classes. Also, call this method by an object of the parent class 
referring to the child class i.e. A obj = new B()

 */
package Assignment;

public class Q5 {
    static void disp(){
        System.out.println("Parent");
    }
}
class B extends Q5{
    static void disp(){
        System.out.println("Child");
    }
}
class Main{
    public static void main(String[] args) {
        Q5 a = new Q5();
        B b = new B();
        a.disp();
        b.disp();
        Q5 c = new B();
        c.disp();
        
    }
}
