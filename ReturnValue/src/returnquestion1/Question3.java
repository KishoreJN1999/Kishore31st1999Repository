package returnquestion1;
class Divisible
{
	int whicharedivby7()
	{
	int sum=0;
	for(int i=100; i<=200; i++)
	{
		if(i%7==0)
		{
			sum=sum+i;
		}
	}
	return sum;
}
}
public class Question3 {
	public static void main(String[] args) {
		Divisible obj = new Divisible();
		int b=obj.whicharedivby7();
		System.out.println(b);
	}
}
