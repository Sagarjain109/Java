/*
 * Create a class to print an integer and a character with two methods having the 
same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first method are of the form (int n, char c), 
then that of the second method will be of the form (char c, int n).

 */
package Assignment;
import java.util.Scanner;


public class Q7 {

    void disp(int x,char y){
        System.out.println("Value is "+x);
        System.out.println("Char is "+y);
    }
    void disp(char x,int y){
        System.out.println("Character is "+x);
        System.out.println("Integer is "+y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer character: ");
        int a = sc.nextInt();
        char c = sc.next().charAt(0);
        Q7 q = new Q7();
        q.disp(c,a);
        sc.close();

    }
}
