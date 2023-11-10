package returnquestion1;
class Demo2
{
	char []lastrow ()
	{
		char ch [][] = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		char res[]=new char[ch.length];
		int k=0;
		for(int i=0;i<ch.length;i++)
		{
			res[k]=ch[2][i];
			k++;
		}
		return res;
	}
}
public class Eq3 {
	public static void main(String[] args) {
		Demo2 obj = new Demo2();

		char a[]=obj.lastrow();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
