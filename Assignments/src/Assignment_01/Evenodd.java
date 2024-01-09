package Assignment_01;

import java.util.Scanner;
public class Evenodd{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        if(n%2==0){
            System.out.println("The number " + n + " is Even");
        }
        else{
            System.out.println("The number " + n + " is Odd");
        }
    }
}
