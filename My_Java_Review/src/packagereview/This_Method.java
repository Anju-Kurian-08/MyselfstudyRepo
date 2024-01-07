package packagereview;

public class This_Method {

	
	public void display1(int a)
	{
		System.out.println(a);
		System.out.println("first method");
	}
	
	public void display()
	{
		System.out.println("second method");
		this.display1(10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Method obj=new This_Method();
		obj.display();
	}

}
