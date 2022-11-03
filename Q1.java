/*
 * 1. Write the code to print following conditions using nested if:
Conditions Discount
If amount>=20000 10%
If amount>=10000 && amount<20000 5%
If amount>=5000 && amount<10000 2%
IF amount<5000 0%
Also print net payment
 */

package Assignment;
import java.util.Scanner;

public class Q1 {

    public static float disc(float a){
        float dis;
        if (a>=20000){
            dis = 10*a/100;
        }
        else if (a>=10000&&a<=20000){
            dis = 5*a/100;
        }
        else if (a>=5000&&a<=10000){
            dis = 2*a/100;
        }
        else {
            dis = 0*a/100;
        }
        return dis;


    }
    public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Amount: ");
            float A = sc.nextFloat();
            float Dis = Q1.disc(A); 
            float Net = A-Dis;
            System.out.println("You have to pay "+Net);
            System.out.println("Have a Nice day");
            sc.close();


    }

}
