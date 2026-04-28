package javaclassprogram;

import java.util.Scanner;

public class onedimentionalarray {
    public static void main(String[] args)
    {
        int arr[] = new int[5];   
        
        Scanner sc = new Scanner(System.in);  
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter the age of student " + i);
            arr[i] = sc.nextInt();  
        }
        
        sc.close(); 
    }
}