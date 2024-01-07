package packagereview;

public class Array_Instantiate {

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		System.out.println(arr[4]);
		
		int arr1[]=new int[10];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=i+1;
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}

}
