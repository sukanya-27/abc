package ex1;
//this is a prime no program.
public class Prime_num1 {
	public static void main(String[] args) {
		int num=29,temp = 0;
		
		for(int i=2;i<=num/2;++i)
		{
			if(num%i ==0)
			{
			   temp++;
			}
		if(temp==0)
			System.out.println(num+"No is a prime");
		
		else
		
			System.out.println(num+"No is not a prime");
		
	}

}
}
