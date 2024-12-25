package com.mycompany.ood;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for number of units
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        // Create an instance 
        ElectricityBillCalculator calculator = new BdElectricityBillCalculator();

        // Calculate the bill
        double billAmount = calculator.calculateBill(units);

        // Display bill 
        System.out.printf("The electricity bill for "+ units +" units is: BDT "+billAmount);
    }
}
