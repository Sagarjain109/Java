/*
 * Write the code to print the factorial of a number using Command Line argument.
 */
package Assignment;

    
public class Q3 {

    static int fact(int a){
        int fac =1;
        for(int i =1;i<a+1;i++){
            fac *=i;
        }
        return fac;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int out = Q3.fact(a);
        System.out.println("Factorial is "+out);
    }
}
