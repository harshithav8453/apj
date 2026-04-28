package javaclassprogram;

public class ElectricityBill {
	public static void main(String[] args) {

        int units = 150;   // change this value as needed
        double bill;

        if (units <= 100) {
            bill = units * 1.50;
        } 
        else if (units <= 200) {
            bill = (100 * 1.50) + ((units - 100) * 2.50);
        } 
        else {
            bill = (100 * 1.50) + (100 * 2.50) + ((units - 200) * 4.00);
        }

        System.out.println("Units Consumed: " + units);
        System.out.println("Total Electricity Bill: Rs " + bill);
    }
}
