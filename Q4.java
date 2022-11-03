/*
 * Write a program to print following pyramids using nested for.
        1
       21
      321
     4321
    54321

 */
package Assignment;
import java.util.Scanner;

public class Q4 {
    void pattern(int A){
        for(int i=1;i<A+1;i++){
            for(int j=A;j>=1;j--){
                if (j>i){
                    System.out.print(" ");
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        Q4 q = new Q4();
        q.pattern(a);
        sc.close();
    }
    
}
