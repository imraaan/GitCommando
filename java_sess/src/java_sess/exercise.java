package java_sess;

public class exercise {
	public static void main(String[] args) {
		int arr[] =  new int[5];
		int count = 1;
		int sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=count;
			count=count*2;
			sum=sum+arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("Sum:"+sum);
		System.out.println("Avg:"+(sum/arr.length));
		}
		
		
}
