package returnquestion1;
class Character 
{
	char[] getfirstrow(char ch [][])
	{
		char c[] = new char[ch[0].length];
		int k=0;
		for(int i=0; i<ch.length; i++)
		{
			c[k] = ch[0][i];
			k++;
		}
		return c;
	}
}
public class Question4 {
	public static void main(String[] args) {
		Character o=new Character();
		char ch[][] = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		char [] res = o.getfirstrow(ch);
		for(int i=0; i<res.length; i++)
		{
			System.out.println(res[i] + " ");
		}
	}
}
