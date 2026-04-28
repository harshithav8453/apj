package javaclassprogram;

public class ExampleForMethodOverloading {
	

	    int area(int s1, int s2)
	    {
	        return s1 * s2;
	    }

	    float area(int s1, float s2)
	    {
	        return s1 * s2;
	    }

	    double area(double s1, double s2)
	    {
	        return s1 * s2;
	    }

	    public static void main(String[] args) {
	        ExampleForMethodOverloading e = new ExampleForMethodOverloading();

	        System.out.println(e.area(10, 10));
	        System.out.println(e.area(12, 12.5f));
	        System.out.println(e.area(12.5, 12.5));
	    }
	}


