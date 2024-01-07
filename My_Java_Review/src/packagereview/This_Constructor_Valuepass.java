package packagereview;

public class This_Constructor_Valuepass {

	
	This_Constructor_Valuepass(int a)
	{
		System.out.println(a);
	}
	
	This_Constructor_Valuepass()
	{
	this(780);
	System.out.println("second constructor");
	}
	public static void main(String[] args) {
		
		This_Constructor_Valuepass obj=new This_Constructor_Valuepass();

	}

}
