package Assignment_01_basic;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the term till you want the fibonacci series: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print("= " + a +" "+ b + " ");
        while(c<n-1){
            int temp = b;
            b = a + b;
            a = temp;
            c++;
            System.out.print(b);
            System.out.print(" ");
        }



    }
}
