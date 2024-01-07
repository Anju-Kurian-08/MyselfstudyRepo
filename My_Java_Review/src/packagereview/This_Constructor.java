package packagereview;

public class This_Constructor {
	
	This_Constructor(){
		System.out.println("first constructor");
	}
	This_Constructor(int a)
	{
		this();
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		This_Constructor obj=new This_Constructor(300);
	}

}
