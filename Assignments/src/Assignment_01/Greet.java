package Assignment_01;

import java.util.Scanner;
public class Greet {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Name:- ");
        String name = scan.nextLine();
        System.out.println("Welcome!"+ name);
    }
}
