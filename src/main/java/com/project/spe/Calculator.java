package com.project.spe;

import java.util.Scanner;

public class Calculator {
//  calculate factorial
    public static long factorial(int n) {
        if(n == 0) {
            return 1;
        }
        else {
            return (n * factorial(n - 1));
        }
    }

    public static double power(int n1, int n2){
        return Math.pow(n1,n2);
    }

    public static double square_root(int n1){
        return Math.sqrt(n1);
    }

    public static void main(String[] args) {
        int choice, exit, n2 = 0, n1 = 0;
        double result;
        long fresult;
        do{

            System.out.println("Enter your choice: ");
            System.out.println("Enter \n1 : Factorial \n2 : Power \n3 : Square Root \n4 : Natural Log \n5 : Exit");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            if(choice == 2){
                System.out.println("Enter num1");
                n1 = sc.nextInt();
                System.out.println("Enter num2");
                n2 = sc.nextInt();
            }
            else if(choice != 5) {
                System.out.println("Enter the number");
                n1 = sc.nextInt();
            }
            else {
                break;
            }
            switch (choice) {
                case 1:
                    fresult = factorial(n1);
                    System.out.println("The factorial of " + n1 + " is = " + fresult);
                    break;
                case 2:
                    result = power(n1,n2);
                    System.out.println("Power of "+n1+" raised to "+n2+ " = "+ result);
                    break;
                case 3:
                    result = square_root(n1);
                    System.out.println("The square root of " + n1 + " is = " + result);
                    break;
                case 4:
                    System.out.println("Natural Log");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println("Do you want to continue using the calculator? Press \n1. Yes \n2. No");
            exit = sc.nextInt();
        }while(exit == 1);
    }
}
