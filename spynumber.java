
public class spynumber {

	public static void main(String[] args) 
	{
		int no =123 ;
		int sum =0;
		int product =1;
		
		
		while(no>0)
		{
			int rem = no%10;
			sum = sum +rem;
			product = product *rem;
			no = no/10;
		}
		System.out.println(sum);
		System.out.println(product);
		if(sum ==product)
		{
			System.out.println("spy number");
		}
		else
		{
			System.out.println("not spy number");
		}
		
		
		

	}

}
