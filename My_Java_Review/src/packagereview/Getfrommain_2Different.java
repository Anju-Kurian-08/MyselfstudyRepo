package packagereview;

public class Getfrommain_2Different {
	
	String name;
	int age,salary;
	Getfrommain_2Different(String a,int b){
	
		name=a;
		age=b;
	}
	Getfrommain_2Different(String a,int b,int c)
	{

		name=a;
		age=b;
		salary=c;
	}
	
	public void display()
	{
		System.out.println("details are "+name+" "+age+" "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Getfrommain_2Different obj=new Getfrommain_2Different("anju",30);
		Getfrommain_2Different obj1=new Getfrommain_2Different("alex",32,3000);
		obj.display();
		obj1.display();
	}

}
