package packagereview;

public class This_Key {
	
	String name;
	int age,salary,id;
	
	This_Key(String name,int age)
	{
		this.name=name;
		this.age=age;
		
		
	}
	This_Key(String name,int age,int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		
		
	}
	This_Key(String name,int age,int salary,int id)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.id=id;
		
	}
	
	public void display() {
		
		System.out.println("details are "+name+" "+age+" "+salary+" "+id);
	}
	public static void main(String[] args) {
	
		This_Key obj=new This_Key("anju",30);
		This_Key obj1=new This_Key("alex",35,3000);
		This_Key obj2=new This_Key("haxel",5,300,1759);
		obj.display();
		obj1.display();
		obj2.display();
		

	}

}
