package Assignment_01_basic;

import java.util.Scanner;
public class Indusd {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the amount in rupees: ");
        float ind = scan.nextFloat();
        float usd = ind/81.9820f;
        System.out.println("$"+usd);
    }
}
