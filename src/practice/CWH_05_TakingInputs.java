package practice;

import java.util.Scanner;

public class CWH_05_TakingInputs {
    public static void main(String[] args) {
        System.out.println("Taking input from the users");
        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter 1st number");
//        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter 2nd number");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();
//        int sum = a + b;
//        float sum = a + b;
//        System.out.print("The sum of "+a+" and "+b+" is ");
//        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
        String str = sc.next();
//        String str = sc.nextLine();
        System.out.println(str);
    }
}
