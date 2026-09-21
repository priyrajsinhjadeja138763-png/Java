//7. Write a java program to use IF Condition.

import java.util.Scanner;

public class U1_07_IfCondition
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = sc.nextInt();

        if(number>0)
        {
            System.out.println("Number is Positive");
        }
        else if(number<0)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is Zero");
        }

        sc.close();
    }
}
