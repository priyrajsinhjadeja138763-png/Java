//8. Write a java program to find ODD or EVEN number using command line argument.

public class U1_08_OddEven
{
    public static void main(String args[])
    {
        int number = Integer.parseInt(args[0]);

        if(number%2==0)
        {
            System.out.println(number + " is EVEN");
        }
        else
        {
            System.out.println(number + " is ODD");
        }
    }
}
