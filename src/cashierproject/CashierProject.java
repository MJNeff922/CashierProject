/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashierproject;

import java.util.Scanner;

/**
 *
 * @author MJNeff18579
 */
public class CashierProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scNum = new Scanner(System.in);
        
        double PRICE1 = 5.99, PRICE2 = 8.99, PRICE3 = 0.99, PRICE4 = 16.99;
        String FOOD1 = "California Roll", FOOD2 = "Calimari", FOOD3 = "Rice", FOOD4 = "Caviar";
        
        System.out.println("Welcome to RESTAURANT.");
        System.out.println("Here is our menu options:");
        System.out.println("1) " + FOOD1 + ", " + PRICE1);
        System.out.println("2) " + FOOD2 + ", " + PRICE2);
        System.out.println("3) " + FOOD3 + ", " + PRICE3);
        System.out.println("4) " + FOOD4 + ", " + PRICE4);
        
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        
        while(true) {
            System.out.print("Please enter your item number: ");
            int itemNumber = scNum.nextInt();
            System.out.print("Please enter your quantity: ");
            int quantity = scNum.nextInt();
            switch(itemNumber) {
                case 1:
                    count1 += quantity;
                    break;
                case 2:
                    count2 += quantity;
                    break;
                case 3:
                    count3 += quantity;
                    break;
                case 4:
                    count4 += quantity;
                    break;
                default:
                    System.out.println("Invalid item number");
            }
            System.out.print("Would you like to order more food? (Y/N) ");
            if(sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("You ordered " + count1 + " " + FOOD1 + " orders, " + count2 + " " + FOOD2 + " orders, " + count3 + " " + FOOD3 + " orders, and " + count4 + " " + FOOD4 + " orders.");
        double subtotal = count1 * PRICE1 + count2 * PRICE2 + count3 * PRICE3 + count4 * PRICE4;
        double tax = subtotal * .07;
        System.out.printf("Your subtotal is $%3.2f. Your tax is $%3.2f. Your final total is $%3.2f.%n", subtotal, tax, (subtotal+tax));
        System.out.print("Payment amount: $");
        double payment = scNum.nextDouble();
        System.out.printf("Change due: $%3.2f%n", (payment - subtotal - tax));
        System.out.println("Thank you for your business " + name + ".");
    }
    
}
