import java.util.*;
class Computer_const {
    private  static int  model_no=0;
    private  int Ram_size;
    private  String Processor_name;
    private  float Price;

    Scanner sc  = new Scanner(System.in);
    public Computer_const()
    {
        model_no+=1;
        System.out.print("Enter RAM size : ");
        Ram_size = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Processor Name : ");
        Processor_name = sc.nextLine();
        System.out.print("Enter Price : ");
        Price = sc.nextFloat();
        sc.close();
    }
    public Computer_const(int r,String n,float p)
    {
        model_no+=1;
        this.Ram_size = r;
        this.Processor_name=n;
        this.Price=p;
    }
    public Computer_const(Computer_const obj)
    {
            model_no+=1;
            this.Ram_size = obj.Ram_size;
            this.Processor_name = obj.Processor_name;
            this.Price = obj.Price;
    }

    public static void display(Computer_const o)
    {
        System.out.print("\nThe Model number : "+model_no);
        System.out.print("\nThe RAM size : "+o.Ram_size);
        System.out.print("\nThe Processor name : "+o.Processor_name);
        System.out.print("\nThe Price : $"+o.Price);
    }
}
class Computer
{
    public static void main(String args[])
    {
        Computer_const ob1 = new Computer_const();
        Computer_const.display(ob1);

        Computer_const ob2 = new Computer_const(16,"Amd",12000);
        Computer_const.display(ob2);

        Computer_const ob3 = new Computer_const(ob2);
        Computer_const.display(ob3);

    }

}
