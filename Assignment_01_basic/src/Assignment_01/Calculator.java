package Assignment_01_basic;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float a = scan.nextInt();
        char o = scan.next().charAt(0);
        float b = scan.nextInt();

        if( o == '+' ){
            System.out.println("= " + (a+b));
        }
        else if ( o == '-'){
            System.out.println("= " + (a-b));
        }
        else if ( o == '*'){
            System.out.println("= " + (a*b));
        }
        else if ( o == '/'){
            System.out.println("= " + (a/b));
        }
    }
}
