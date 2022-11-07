/*
Create a class “Bank” and create subclasses “SBI”, “Axis” and “PNB” and redefine 
abstract method “getrateofinterest” of superclass in subclasses*/

package Assignment;
//import java.util.Scanner;

abstract class Q9 {
    abstract void getrateofinterest();
    
}
class SBI extends Q9{
    void getrateofinterest(){
        System.out.println("This bank have  3% to 6.5% rate of interest for FD.");
    }
}
class Axis extends Q9{
    void getrateofinterest(){
        System.out.println("This bank have to 2.5% to 5.75% rate of interest for Fd.");
    }
}
class PNB extends Q9{
    void getrateofinterest(){
        System.out.println("This bank have 8.9% to 14.95% rate of interest p.a for Loan.");
    }
}
class Main{
    public static void main(String[] args) {
        PNB p = new PNB();
        p.getrateofinterest();
            
        };
    }

