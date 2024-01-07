package packagereview;

public class Static_Instance_Variable {
	static int b=15;
	int a=10;
	public  void add()
	{

	int c=a+b;
	System.out.print("sum of numbers is "+c);
	}
	public static void main(String[] args) {
		Static_Instance_Variable obj=new Static_Instance_Variable();
		// TODO Auto-generated method stub
obj.add();
	}

}
