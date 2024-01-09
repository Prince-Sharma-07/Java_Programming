package Assignment_01;

import java.util.Scanner;
public class Simpleinterest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        int p = scan.nextInt();
        System.out.println("Enter the rate of interest: ");
        float r = scan.nextFloat();
        System.out.println("Enter the Time period in years: ");
        int t = scan.nextInt();
        float simple_interest = p*r*t/100;
        System.out.println("The SI is: " + simple_interest);
    }
}
