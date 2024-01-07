package packagereview;

public class Static_Overload {
	
	public static void display(int a,int b,int c)
	{
		System.out.println("sum of numbers is "+(a+b+c));
	}
 public static void display(float a,float b)
 {
	 System.out.println("sum of float numbers is "+(a+b));
 }
 
 public static void display(String c)
 {
	 System.out.println("my name is "+c);
 }
	public static void main(String[] args) {
	
display(10,20,30);
display(20.2f,30.5f);
display("anju");


	}

}
