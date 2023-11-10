package returnquestion1;
class Factorial
{
	int fact(int num)
	{

		int fact=1;
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class Question6 {
	public static void main(String[] args) {
		Factorial obj = new Factorial();
		int a=obj.fact(7);
		System.out.println("factorial result:" + a);
	}
}

