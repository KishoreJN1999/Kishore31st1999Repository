package returnquestion1;
class Demo
{
	String [] fruits(String a[])
	{
		String s[]=new String [a.length];
		int k=0;
		for(int i=0; i<a.length; i++)
		{
			s[k]=a[i];
			k++;
		}
		return s;
	}
}
public class Eq1 {
	public static void main(String[] args) {
		Demo o=new Demo();
		String x[]= {"apple", "orange", "mango"};
		String res[]=o.fruits(x);
		for(int i=0; i<res.length; i++)
		{
			System.out.println(res[i]);
		}
	}
}
