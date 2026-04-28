package javaclassprogram;

public class ExampleForMethods {
	

	    
	    int add(int a, int b) {
	        return a + b;
	    }

	    
	    void subtract(int a, int b) {
	        System.out.println("Subtract : " + (a - b));
	    }

	   
	    void mul() {
	        int a = 5;
	        int b = 10;
	        int result = a * b;
	        System.out.println(result);
	        
	    }
	 
	    int div()
	    {
	        int n1 = 100;
	        int n2 = 10;
	        return n1 / n2;
	    }

	    public static void main(String[] args) {

	        ExampleForMethods e = new ExampleForMethods();

	        
	        System.out.println(e.add(27, 56));

	       
	        e.subtract(100, 10);

	        
	        e.mul();

	        
	        System.out.println(e.div());
	    }
	}


