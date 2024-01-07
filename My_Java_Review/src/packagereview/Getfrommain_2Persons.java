package packagereview;

public class Getfrommain_2Persons {
	
	String name;
	int age,salary;
	
	Getfrommain_2Persons(String a,int b,int c)
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
		Getfrommain_2Persons obj=new Getfrommain_2Persons("anju",30,3000);
		Getfrommain_2Persons obj1=new Getfrommain_2Persons("alex",40,4000);
		obj.display();
		obj1.display();

	}

}
