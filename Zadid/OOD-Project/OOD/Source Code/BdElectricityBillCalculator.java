package com.mycompany.ood;

public class BdElectricityBillCalculator implements ElectricityBillCalculator {

    @Override
    public double calculateBill(int units) {
        double billAmount ;
        
        // Slab rates 
        if (units <= 50) {
            billAmount = units * 3.75;
        } else if (units <= 75) {
            billAmount = 50 * 3.75 + (units - 50) * 4.19;
        } else if (units <= 200) {
            billAmount = 50 * 3.75 + 25 * 4.19 + (units - 75) * 5.72;
        } else if (units <= 300) {
            billAmount = 50 * 3.75 + 25 * 4.19 + 125 * 5.72 + (units - 200) * 6.00;
        } else if (units <= 400) {
            billAmount = 50 * 3.75 + 25 * 4.19 + 125 * 5.72 + 100 * 6.00 + (units - 300) * 6.34;
        } else {
            billAmount = 50 * 3.75 + 25 * 4.19 + 125 * 5.72 + 100 * 6.00 + 100 * 6.34 + (units - 400) * 9.94;
        }
        
        // Adding a fixed charge of BDT 30
        billAmount += 30.0;
        
        return billAmount;
    }
}
