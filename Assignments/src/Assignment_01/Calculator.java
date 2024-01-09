package Assignment_01;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char o = scan.next().charAt(0);
        int b = scan.nextInt();

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
