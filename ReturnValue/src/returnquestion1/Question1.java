package returnquestion1;

class Sumof
{
	int first20(int a)
	{
		int sum=0;
		for(int i=1; i<=a; i++)
		{
			sum+=i;
		}
		return sum;
	}
}
public class Question1 
{
	public static void main(String[] args) 
	{
		Sumof o=new Sumof();
		int a=o.first20(20);
		System.out.println(a);
	}
}
