package Assignment_01_basic;

import java.util.Scanner;
public class Largest {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
    System.out.println("Enter the first number: ");
    int a = scan.nextInt();
    System.out.println("Enter the second number");
    int b = scan.nextInt();
    if (a>b){
        System.out.println(a +" is Largest");
    }
    else {
        System.out.println(b +" is Largest");
    }
    }
}


