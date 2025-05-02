import java.util.*;
public class assignment2 {
    public static void main(String args[])
    {
        System.out.println("enter first number");
        Scanner scan = new Scanner(System.in);
        int A= scan.nextInt();
        System.out.println("enter second number");
        Scanner scaan = new Scanner(System.in);
        int B=scaan.nextInt();
        int sum= A + B;
        System.out.println(sum);
        scan.close();
        scaan.close();
    }
}
