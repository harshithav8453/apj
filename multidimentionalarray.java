package javaclassprogram;

import java.util.Scanner;

public class multidimentionalarray {
    public static void main(String[] args)
    {
        int arr[][][] = new int[2][2][5];  

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                for(int k = 0; k < arr[i][j].length; k++)
                {
                    System.out.println("Enter the age of student " + k + " batch " + j + " group " + i);
                    arr[i][j][k] = s.nextInt();   
                }
            }
        }

        s.close(); 
    } 
}