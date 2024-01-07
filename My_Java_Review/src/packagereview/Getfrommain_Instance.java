package packagereview;

public class Getfrommain_Instance {
	
	String s;
	Getfrommain_Instance(String a)
	{
	s=a;	
	}
	public void display()
	{
		System.out.println("get from main and print in default instance method"+ s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Getfrommain_Instance obj=new Getfrommain_Instance("anju kurian");
		obj.display();
	}

}
