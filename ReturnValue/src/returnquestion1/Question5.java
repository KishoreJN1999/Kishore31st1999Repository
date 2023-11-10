package returnquestion1;
class Concatinate 
{
	String concatinate1(String b[][])
	{
		String s = " ";
		
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[0].length; j++)
			{
				s+=b[i][j];
				
			}
		}
		return s;
	}
}

public class Question5 {

	public static void main(String[] args) {
		Concatinate o = new Concatinate();
		String  a[][] = {{"Welcome","to","home"},{"take","some","rest"},{"afterward","we","will"}, {"go","outside","enjoy"}};
		 String res=o.concatinate1(a);
		{
			System.out.println(res);
		}
		

	}

}
