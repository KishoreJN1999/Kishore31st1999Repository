package returnquestion1;
class Demo1
{
	int [][] num(int[][] b)
	{
		int i[][]=new int[b.length][b[0].length];
		for(int j=0; j<b.length; j++)
		{
			for(int k=0; k<b[j].length; k++)
			{
				i[j][k]=b[j][k];
			}
		}
		return i;
	}
}
public class Eq2 {
	public static void main(String[] args) {
		Demo1 o=new Demo1();
		int x[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int res[][]=o.num(x);
		for(int i=0; i<res.length; i++)
		{
			for(int j=0; j<res.length; j++)
			{
				System.out.print(res[i][j]);
			}
			System.out.println();
		}	
	}
}