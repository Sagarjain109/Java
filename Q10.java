/*
 * . Create an interface “Bank” and create class “SBI”, “Axis” and “PNB” and 
implements interface abstract method “getrateofinterest” of interface in “SBI”, 
“Axis” and “PNB”

 */
package Assignment;

public interface Q10 {
       void getrateofInterest1();
}
class Axis implements Q10{
    public void getrateofInterest1(){
        System.out.println("Hello..");
    }
}
class PNB implements Q10{
    public  void getrateofInterest1(){
        System.out.println("Hy..");
    }
}
class SBI implements Q10{
    public void getrateofInterest1(){
        System.out.println("Hey..");
    }
}
class Main{
    public static void main(String[] args) {
        SBI s = new SBI();
        s.getrateofInterest1();
    }
}
