package packagereview;

public class Instance_Return_Parametrized {
	
	public int display(int a,int b,int c)
	{
		int d=a+b+c;
		return d;
		}

	public static void main(String[] args) {
		Instance_Return_Parametrized obj=new Instance_Return_Parametrized();
		System.out.println("print in main method "+obj.display(10, 20, 30));

	}

}
