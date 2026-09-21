//3. Write a java program to get personal information from user and display on screen.

import java.util.Scanner;

public class U1_03_PersonalInfo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Surname : ");
        String surname = sc.nextLine();

        System.out.println("Enter University : ");
        String university = sc.nextLine();

        System.out.println("Enter Course : ");
        String course = sc.nextLine();

        System.out.println("\nPersonal Information");
        System.out.println("Name       : " + name);
        System.out.println("Surname    : " + surname);
        System.out.println("University : " + university);
        System.out.println("Course     : " + course);

        sc.close();
    }
}
