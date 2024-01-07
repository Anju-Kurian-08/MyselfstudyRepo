package packagereview;

public class Getfrommain_2int_Instance {
	int s,d;
	
	Getfrommain_2int_Instance(int a,int b)
	{
		s=a;
		d=b;
	}
	
	public void display()
	{
		System.out.println("integers get from main and print in default instance methods are "+s+" "+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Getfrommain_2int_Instance obj=new Getfrommain_2int_Instance(10,30);
		obj.display();
	}

}
