//2. Write a java program to get a name from user and display on screen.

import java.util.Scanner;

public class U1_02_DisplayName
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Hello, " + name);

        sc.close();
    }
}
