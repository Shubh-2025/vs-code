import java.util.*;
public class assignment4 {
    public static void main(String args[]){
        System.out.println("enter the 1st number");
        Scanner sc1 = new Scanner(System.in);
        int A = sc1.nextInt();
        System.out.println("enter the 2nd number");
        Scanner sc2 = new Scanner(System.in);
        int B = sc2.nextInt();
        System.out.println("enter the 3rd number");
        Scanner sc3 = new Scanner(System.in);
        int C = sc3.nextInt();
        if (A>B && A>C) {
            System.out.println("THE BIGGEST NUMBER BETWEEN THE THREE IS="+ A);
        }
        else if (B>A && B>C) {
            System.out.println("THE BIGGEST NUMBER BETWEEN THE THREE IS="+ B);
        }
        else if (C>B && C>A) {
            System.out.println("THE BIGGEST NUMBER BETWEEN THE THREE IS="+ C);
        }
        else {System.out.println("the numbers are equal");
        sc1.close();
        sc2.close();
        sc3.close();
    }
       
}
}

