/*
 * Write a program to check if the letter 'e' is present in the word 'Umbrella'
 */

package Assignment;
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();

        System.out.print("Enter the letter which you want to check in the string: ");
        String c= sc.nextLine();

        if(s.contains(c)){
            System.out.println(c+" is present in "+s);
        }
        else{
            System.out.println(c+" is not present in "+s);
        }
        
        sc.close();
    }
}
