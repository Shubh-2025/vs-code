import java.util.Scanner;
public class assignment
{
    public static void main(String args[]){
    System.out.println ("enter the number");
    Scanner imp = new Scanner(System.in);
    int x= imp.nextInt();                              // ( question no .1 )
    int sum=x*x;
    System.out.println(sum);
    imp.close();
}
}

