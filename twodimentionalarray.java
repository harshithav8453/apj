package javaclassprogram;

import java.util.Scanner;

public class twodimentionalarray {
    public static void main(String[] args)
    {
        int arr[][] = new int[2][5];   

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.println("Enter the age of student " + j + " batch " + i);
                arr[i][j] = s.nextInt();   
            }
        }

        s.close(); 
    }
}