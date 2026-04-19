package javaclassprogram;

public class marksvalidation {
	public static void main(String[] args) {

        int a = 70;

        System.out.println("Enter your marks: " + a);

        if (a < 0 || a > 100) {
            System.out.println("Invalid marks");
        } 
        else if (a >= 81 && a <= 100) {
            System.out.println("Distinction");
        } 
        else if (a >= 60 && a <= 80) {
            System.out.println("First class");
        } 
        else if (a >= 35 && a <= 59) {
            System.out.println("Second class");
        } 
        else {
            System.out.println("Fail");
        }
    }

}
