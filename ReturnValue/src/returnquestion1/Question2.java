package returnquestion1;
class Countof
{
	int oddnumbers(int a)
	{
		int count=0;
		for(int i=150; i<=a; i++)
		{
			if(i%2==1)
			{
				count++;
			}
		}
		return count;
	}
}
public class Question2 {
	public static void main(String[] args) {
		Countof obj = new Countof();
		int a=obj.oddnumbers(250);
		
		System.out.println(a);
	}
}
