package packagereview;

public class String_Upper_Lower {

	public static void main(String[] args) {
		String s1="Anju";
		String s2=" Kurian ";
		String s3="hazel";
		String s4="thi is the method";
		String s5="Anju";
		String s6="anju";
		String s7="";
		int a=10,b=20;
		System.out.println("lower case is "+s1.toLowerCase());
		System.out.println("uppercase is "+s2.toUpperCase());
		System.out.println("trimmed value is "+s2.trim());
		System.out.println("string starting with "+s1.startsWith("an"));
		System.out.println("string ending with "+s3.endsWith("el"));
		System.out.println(s3.charAt(3));
		System.out.println("length of string is "+s3.length());
        System.out.println("replace the word method "+s4.replace("method","action"));
        System.out.println(s1.concat(s2));
        System.out.println(s4.contains("thi is"));
        System.out.println(s4.contains("action"));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s6));
        System.out.println(s7.isEmpty());
        String s12=String.valueOf(a);
        String s13=String.valueOf(b);
        System.out.println(s12+s13);
        System.out.println(a+b);
        
	}

}
