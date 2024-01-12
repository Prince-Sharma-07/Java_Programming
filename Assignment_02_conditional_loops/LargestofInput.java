package Assignment_02_conditional_loops;

import java.util.Scanner;

public class LargestofInput {
    public static void main(String[] args) {


        System.out.println("Enter Zero if you want to imput a number:");
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        int a=-1;
        while (a != 0) {
            a = in.nextInt();
            if(a!=0) {
                sum += a;
            }
        }
        System.out.println("The Sum of input is: " + sum);
    }

}
