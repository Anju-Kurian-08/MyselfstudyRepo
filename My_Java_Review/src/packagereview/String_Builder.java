package packagereview;

public class String_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="anju";
StringBuilder obj=new StringBuilder(s1);
obj.append("kurian");
obj.insert(2, "hazel");
obj.replace(0, 2, "pn");
obj.delete(2, 3);
System.out.println(obj.toString());
	}

}
