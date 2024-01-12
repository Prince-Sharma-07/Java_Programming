package Assignment_03_methods;

import java.util.Scanner;

public class IsPrime {
    public static void prime(int n){
        if(n<2){
            System.out.println(n + " is not a prime no");
        }
        for(int i = 2; i<n; i++){
            if(n%i==0){
                System.out.println(n + " is not prime number");
                return;
            }
        }
        System.out.println(n + " is a prime number");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no = in.nextInt();
        prime(no);
    }
}
