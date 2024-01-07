package packagereview;

public class Array_Evenoddsum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int evensum=0,oddsum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evensum=evensum+arr[i];
			}
			else
			{
				oddsum=oddsum+arr[i];
			}
		}
			System.out.println("sum of even numbers is "+evensum);
			System.out.println("sum of odd numbers is "+oddsum);
		

	}

}
