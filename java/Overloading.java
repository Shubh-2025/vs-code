import java.util.*;

class ThreeD 
{
	public static void volume(double r) //Sphere
	{
		double vol = ((4.0/3.0)*3.14*(r*r*r));
		System.out.println("Volume of The Sphere : "+vol+" unit^3");
	}
	public static void volume(float r , float h) //Cone
	{
		double vol = (1.0/3.0)*3.14*(r*r)*h;
		System.out.println("Volume of The Cone : "+vol+"unit^3");
	}
	public static void volume(double r , double h) //Cylinder
	{
		double vol = 3.14*(r*r)*h;
		System.out.println("Volume of The Cylinder : "+vol+"unit^3");

	}


	public static void Surface_area(double r) //Sphere
	{
		double vol = 4.0*3.14*(r*r);
		System.out.println("Surface_area of The Sphere : "+vol+" unit^2");
	}
	public static void Surface_area(float r , float l) //Cone
	{
		double vol = 3.14*(r*r)+(3.14*r*l);
		System.out.println("Surface_area of The Cone : "+vol+" unit^2");
	}
	public static void Surface_area(double r , double h) //Cylinder
	{
		double vol = 2.0*3.14*(r*r)+(2*3.14*r*h);
		System.out.println("Surface_area of The Cylinder : "+vol+" unit^2");
	}
}

class M
{
	public static void main(String args[])
		{
			Scanner sc  = new Scanner(System.in);
			System.out.print("Enter Your choice [ Sphere (1) | Cone (2) | Cylinder (3) ] :");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1 : System.out.print("Want to calculate Volume (1) / Surface area (2) ?\nEnter choice:");
					int ch1 = sc.nextInt();
					if(ch1==1)
					{System.out.print("Enter radius of sphere : ");
		 			 double r1 = sc.nextDouble();
					 ThreeD.volume(r1);	
					}
					else if (ch1==2)
					{System.out.print("enter radius of sphere : ");
					 double r2 = sc.nextDouble();
					 ThreeD.Surface_area(r2);	
					} 
					break;

				case 2 : System.out.print("Want to calculate Volume (1) / Surface area (2) ?\nEnter choice:");
					int ch2 = sc.nextInt();
					if(ch2==1)
					{System.out.print("Enter radius of Cone : ");
		 			 float r1 = sc.nextFloat();
					System.out.print("Enter height of Cone : ");
		 			 float h1 = sc.nextFloat();

					 ThreeD.volume(r1,h1);	
			
					}
					else if (ch2==2)
					{System.out.print("Enter radius of Cone : ");
					 double r2 = sc.nextDouble();
					System.out.print("Enter length of Cone : ");
		 			 float l1 = sc.nextFloat();

					 ThreeD.Surface_area(r2,l1);	
					} 
					break;

				case 3 : System.out.print("Want to calculate Volume (1) / Surface area (2) ?\nEnter choice:");
					int ch3 = sc.nextInt();
					if(ch3==1)
					{System.out.print("Enter radius of Cylinder : ");
		 			 double r3 = sc.nextDouble();
					System.out.print("Enter height of Cylinder : ");
		 			 double h3 = sc.nextDouble();

					 ThreeD.volume(r3,h3);	
					}
					else if (ch3==2)
					{System.out.print("Enter radius of Cylinder : ");
					 double r4 = sc.nextDouble();
					System.out.print("Enter height of Cylinder : ");
		 			 double l3 = sc.nextDouble();

					 ThreeD.Surface_area(r4,l3);	
					} 
					break;
			}
			sc.close();
		}
}