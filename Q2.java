/*
 * Write the code to print whether the number is prime not using Scanner class.
 */
package Assignment;
import java.util.Scanner;

public class Q2 {
    static boolean prime(int num){
        int count =1;
        for (int i=2;i<num+1;i++){
            if (num%i==0){
                count+=1;
            }
        }
        if (count==2){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to check prime or not: ");
        int a= sc.nextInt();
        System.out.println(Q2.prime(a));
        sc.close();

    }
    
}
