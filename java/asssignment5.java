import java.util.*;
public class asssignment5 {
    public static void main(String args[]){
        System.out.println("enter the value you want to check");
        Scanner check =new Scanner(System.in);
        int A= check.nextInt();
        check.close();
        if(A%2==1){
            System.out.print("the number is an odd number");
        }
            else 
                System.out.print("the number is an even number");
        
    }    
}
