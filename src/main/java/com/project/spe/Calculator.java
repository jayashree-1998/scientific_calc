package com.project.spe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

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
        int choice,n1;
        double result;
        long fresult;
        double base, exponent;
        Scanner sc = new Scanner(System.in);


        System.out.println("Please press Enter to use the scientific calculator");
        sc.nextLine();
        logger.info("Pressed Enter to enter the application");

        do{
            choice = 0;
            while(choice < 1 || choice > 5) {
                try{
                    logger.info("Enter choice");
                    System.out.println("Enter your choice: ");
                    System.out.println("1 : Factorial \n2 : Power \n3 : Square Root \n4 : Natural Log \n5 : Exit");
                    choice = sc.nextInt();
                    if(choice < 1 || choice > 5){
                        logger.warn("The entered choice is invalid");
                        System.out.println("Please enter a valid choice");
                    }
                }
                //for non numeric input
                catch(InputMismatchException error){
                    logger.error("Invalid Option : Option entered was not between 1 - 5");
                    System.out.println("Please enter a valid choice");
                }
                sc.nextLine();
            }
            logger.info("Valid Input Chosen - " + choice);
            switch (choice) {
                case 1:
                    n1 = -1;
                    while (n1 < 0) {
                        try {
                            logger.info("Enter a valid number");
                            System.out.println("Enter a non negative integer number");
                            n1 = sc.nextInt();
                            if (n1 < 0) {
                                logger.warn("Number entered is negative");
                                System.out.println("Factorial is only applicable on non-negative numbers!! ");
                            }
                            } catch (InputMismatchException error) {
                            logger.error("Invalid Option : Factorial is only applicable on non-negative numbers!!");
                            System.out.println("Factorial is only applicable on non-negative numbers!! ");
                            }
                            sc.nextLine();
                    }
                    logger.info("Valid Input entered for Factorial - " + n1);
                    fresult = factorial(n1);
                    logger.info("Result of Factorial - " + fresult);
                    System.out.println("The factorial of " + n1 + " is = " + fresult);
                    break;
                case 2:
                    base = -1;
                    exponent = 2.3;
                    while (base < 0 && (int)exponent != exponent) {
                        try {
                            logger.info("Enter a valid base");
                            System.out.println("Enter the base");

                            base = sc.nextDouble();
                            logger.info("Enter a valid exponent");
                            System.out.println("Enter the exponent");
                            exponent = sc.nextDouble();
                            if (base < 0 && (int)exponent != exponent) {
                                logger.warn("Invalid : Base entered is negative and exponent is a decimal number");
                                System.out.println("You cannot have a negative base with decimal exponent");
                                System.out.println("Enter a valid base and exponent");
                            }
                            } catch (InputMismatchException error) {
                                logger.error("Invalid Option : Base or exponent entered is invalid");
                                System.out.println("Enter a valid base and exponent");
                            }
                            sc.nextLine();
                        }
                    logger.info("Valid input entered for Power : Base - " + base + "Exponent - " + exponent);
                    result = power(base, exponent);
                    logger.info("Result of Power function - " + result);
                    System.out.println("Power of " + base + " raised to " + exponent + " = " + result);
                    break;
                case 3:
                    n1 = -1;
                    while (n1 < 0) {
                        try {
                            logger.info("Enter a valid number");
                            System.out.println("Enter a non negative number");
                            n1 = sc.nextInt();
                            if (n1 < 0) {
                                logger.warn("Number entered is negative");
                                System.out.println("Square Root is only applicable on non-negative numbers!! ");
                            }
                        } catch (InputMismatchException error) {
                            logger.error("Invalid Option : Square Root is only applicable on non-negative numbers!!");
                            System.out.println("Square Root is only applicable on non-negative numbers!! ");
                        }
                        sc.nextLine();
                    }
                    logger.info("Valid input entered for Square Root - " + n1);
                    result = square_root(n1);
                    logger.info("Result of Square Root - " + result);
                    System.out.println("The square root of " + n1 + " is = " + result);
                    break;
                case 4:
                    n1 = -1;
                    while (n1 < 0) {
                        try {
                            logger.info("Enter a valid number");
                            System.out.println("Enter a positive number");
                            n1 = sc.nextInt();
                            if (n1 < 0) {
                                logger.warn("Number entered is negative");
                                System.out.println("Natural Log is only applicable on positive numbers!! ");
                            }
                        } catch (InputMismatchException error) {
                            logger.error("Invalid Option : Square Root is only applicable on positive numbers!!");
                            System.out.println("Natural Log is only applicable on positive numbers!! ");
                            }
                        sc.nextLine();
                    }
                    logger.info("Valid input entered for Natural Log - " + n1);
                    result = natural_log(n1);
                    logger.info("Result of Natural Log - " + result);
                    System.out.println("The Natural Log of " + n1 + " is = " + result);
                    break;
                case 5:
                    logger.fatal("Program is exiting!!");
                    sc.close();
                    return;
                default:
                    logger.warn("Enter a valid choice!");
                    System.out.println("Invalid Choice, Please enter valid choice!");
            }
        }while(true);
    }
}
