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

    public static void main(String[] args) {
        int choice, n1, exit;
        long fresult;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            System.out.println("Enter \n1 : Factorial \n2 : Exit");
            choice = sc.nextInt();
            if(choice != 2) {
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
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println("Do you want to continue using the calculator? Press \n1. Yes \n2. No");
            exit = sc.nextInt();
        }while(exit == 1);
    }
}
