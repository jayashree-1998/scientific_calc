package com.project.spe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
//  calculate factorial
    public static long factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return(n * factorial(n - 1));
    }

    public static double power(double base, double exponent){
        return Math.pow(base,exponent);
    }

    public static double square_root(int n){
        return Math.sqrt(n);
    }

    public static double natural_log(int n){
        if(n == 0) {
            return (Double.NEGATIVE_INFINITY);
        } else if (n == Double.POSITIVE_INFINITY) {
            return( Double.POSITIVE_INFINITY);
        } else {
            return Math.log(n);
        }
    }

    public static void main(String[] args) {
        int choice, exit,n1 = 0;
        double result;
        long fresult;
        double base, exponent;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please press Enter to use the scientific calculator");
        sc.nextLine();

        do{
            choice = 0;
            while(choice < 1 || choice > 5) {
                try{
                    System.out.println("Enter your choice: ");
                    System.out.println("1 : Factorial \n2 : Power \n3 : Square Root \n4 : Natural Log \n5 : Exit");
                    choice = sc.nextInt();
                    if(choice < 1 || choice > 5){
                        System.out.println("Please enter a valid choice");
                    }
                }
                //for non numeric input
                catch(InputMismatchException error){
                    System.out.println("Please enter a valid choice");
                }
                sc.nextLine();
            }
            switch (choice) {
                    case 1:
                    n1 = -1;
                    while (n1 < 0) {
                        try {
                            System.out.println("Enter a non negative integer number");
                            n1 = sc.nextInt();
                            if (n1 < 0) {
                                System.out.println("Factorial is only applicable on non-negative numbers!! ");
                            }
                            } catch (InputMismatchException error) {
                                System.out.println("Factorial is only applicable on non-negative numbers!! ");
                            }
                            sc.nextLine();
                    }
                    fresult = factorial(n1);
                    System.out.println("The factorial of " + n1 + " is = " + fresult);
                    break;
                    case 2:
                        base = -1;
                        exponent = 2.3;
                        while (base < 0 && (int)exponent != exponent) {
                            try {
                                System.out.println("Enter the base");
                                base = sc.nextDouble();
                                System.out.println("Enter the exponent");
                                exponent = sc.nextDouble();
                                if (base < 0 && (int)exponent != exponent) {
                                    System.out.println("You cannot have a negative base with decimal exponent");
                                    System.out.println("Enter a valid base and exponent");
                                }
                            } catch (InputMismatchException error) {
                                System.out.println("Enter a valid base and exponent");
                            }
                            sc.nextLine();
                        }
                        result = power(base, exponent);
                        System.out.println("Power of " + base + " raised to " + exponent + " = " + result);
                    break;
                    case 3:
                    n1 = -1;
                    while (n1 < 0) {
                        try {
                            System.out.println("Enter a non negative number");
                            n1 = sc.nextInt();
                            if (n1 < 0) {
                                System.out.println("Square Root is only applicable on non-negative numbers!! ");
                            }
                        } catch (InputMismatchException error) {
                            System.out.println("Square Root is only applicable on non-negative numbers!! ");
                        }
                        sc.nextLine();
                    }
                    result = square_root(n1);
                    System.out.println("The square root of " + n1 + " is = " + result);
                    break;
                case 4:
                    n1 = -1;
                    while (n1 < 0) {
                        try {
                            System.out.println("Enter a positive number");
                            n1 = sc.nextInt();
                            if (n1 < 0) {
                                System.out.println("Natural Log is only applicable on positive numbers!! ");
                            }
                        } catch (InputMismatchException error) {
                            System.out.println("Natural Log is only applicable on positive numbers!! ");
                            }
                        sc.nextLine();
                    }
                    result = natural_log(n1);
                    System.out.println("The Natural Log of " + n1 + " is = " + result);
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice, Please enter valid choice!");
            }
        }while(true);
    }
}
