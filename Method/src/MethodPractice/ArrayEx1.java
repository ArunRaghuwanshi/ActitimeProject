package MethodPractice;

public class ArrayEx1 {
    
	public static void main(String[] args) {
		int a[]= {5,7,8,9,6};
		
	 /*	int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			//System.out.println(sum);
		}
		System.out.println(sum); */
		
		System.out.println("even number");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		
	}
}
