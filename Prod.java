package Sagar;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prod extends Sum {
    void mul() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = a*b;
        System.out.println(res);
    }
}
