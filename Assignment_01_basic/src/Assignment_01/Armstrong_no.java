package Assignment_01_basic.src.Assignment_01;
import java.util.Scanner;


public class Armstrong_no {
    public static int flag = 0;
    public static int a = 0;
    public static int b = 0;

    public static void IsArmstrong(int n){
        int u = n;
        int sum = 0;
        while(n!=0){
            int rem = n % 10;
            sum+=rem*rem*rem;
            n /= 10;
        }
        if(sum==u) {
            flag++;
            if (a == 0) {
                a = sum;
                return;
            }
            b = sum;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner in = new Scanner(System.in);
        int first_no = in.nextInt();
        int second_no = in.nextInt();
        IsArmstrong(first_no);
        IsArmstrong(second_no);
        if(flag==0){
            System.out.println("BOTH NUMBERS ARE NOT ARMSTRONG");
        }
        if(flag == 2){
            System.out.println("BOTH  ARE ARMSTRONG");
        }
        if(flag==1){
            if(a!=0){
                System.out.println(a + " is an armstrong no");
            }
            if(b!=0){
                System.out.println(b + " is an armstrong no");
            }
        }
    }
}
