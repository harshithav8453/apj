package javaclassprogram;

public class GroceryBill {
	public static void main(String[] args) {
        String itemName = "Rice";
        int quantity = 10;
        double pricePerUnit = 60.0;
        int isMember = 1;         
        double subtotal = quantity * pricePerUnit;        
        double discount = 0;
        if (isMember == 1) {
            discount = subtotal * 0.10;
        }
        double afterDiscount = subtotal - discount;
        double gst;
        if (afterDiscount > 500) {
            gst = afterDiscount * 0.05;
        } else {
            gst = afterDiscount * 0.12;
        }
        double total = afterDiscount + gst;
        System.out.println("Item Name: " + itemName);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("GST: " + gst);
        System.out.println("Final Total: " + total);
    }
}


