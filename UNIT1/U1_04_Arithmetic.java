//4. Write a java program to perform different arithmetic operations. (Using Command Line args)

public class U1_04_Arithmetic
{
    public static void main(String args[])
    {
        int no1 = Integer.parseInt(args[0]);
        int no2 = Integer.parseInt(args[1]);

        int sum = no1 + no2;
        int sub = no1 - no2;
        int mul = no1 * no2;
        int div = no1 / no2;
        int mod = no1 % no2;

        System.out.println("SUM : " + sum);
        System.out.println("SUB : " + sub);
        System.out.println("MUL : " + mul);
        System.out.println("DIV : " + div);
        System.out.println("MOD : " + mod);
    }
}
