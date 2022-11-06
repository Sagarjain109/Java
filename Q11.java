package Assignment;
import java.util.Scanner;
import java.util.Arrays;
public class Q11 {
    float avg(int A[]){
        int sum=0;
        float aver=0;
        for(int j=0;j<A.length;j++){
            sum+=A[j];
        }
        System.out.println("Sum of the Elements of Array is "+sum+".");
        aver = sum/A.length;
        return aver;
    }
    public static void main(String [] args){
        Q11 q = new Q11();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size= sc.nextInt();
        int A[] = new int [size];
        for(int i =0;i<size;i++){
            A[i]= sc.nextInt();
        }
        System.out.println("Array is "+Arrays.toString(A));
        float Avg = q.avg(A);
        System.out.println("Average of the elements of the Array is "+Avg+".");
        sc.close();
    }
}
