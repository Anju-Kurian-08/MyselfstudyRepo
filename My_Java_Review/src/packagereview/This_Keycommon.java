package packagereview;

public class This_Keycommon {
	String name;
	int age,salary,id;
	
	This_Keycommon(String name,int age)
	{
		this.name=name;
		this.age=age;
		
		
	}
	This_Keycommon(String name,int age,int salary)
	{
		this(name,age);
		this.salary=salary;
		
		
	}
	This_Keycommon(String name,int age,int salary,int id)
	{
		this(name,age,salary);
		this.id=id;
		
	}
	
	public void display() {
		
		System.out.println("details are "+name+" "+age+" "+salary+" "+id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Keycommon obj=new This_Keycommon("anju",30);
		This_Keycommon obj1=new This_Keycommon("alex",35,3000);
		This_Keycommon obj2=new This_Keycommon("haxel",5,300,1759);
		obj.display();
		obj1.display();
		obj2.display();
	}

}
