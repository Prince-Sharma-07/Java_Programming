package Assignment_03_methods;

import java.util.Scanner;

public class Grades {
    public static void grades(int n) {
        if(n<=40){
            System.out.println("Fail");
            return;
        }
        if(n>40 && n<51){
            System.out.println("DD");
            return;
        }
        if(n>50 && n<61){
            System.out.println("CD");
            return;
        }
        if(n>60 && n<71){
            System.out.println("BC");
            return;
        }
        if(n>70 && n<81){
            System.out.println("BB");
            return;
        }
        if(n>80 && n<91){
            System.out.println("AB");
            return;
        }
        if(n>90 && n<101){
            System.out.println("AA");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        grades(no);
    }
}
