//10. Write a java program of 1D array.

import java.util.Scanner;

public class U1_10_Array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter 5 numbers : ");
        for(int i=0;i<5;i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements are : ");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }

        sc.close();
    }
}
