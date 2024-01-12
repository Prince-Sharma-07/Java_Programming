package Assignment_03_methods;

import java.util.Scanner;

public class Min_max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("The maximum element is " + (Math.max(a,Math.max(b,c))));
        System.out.println("The minimum element is " + (Math.min(a,Math.min(b,c))));
    }
}
