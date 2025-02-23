package array_examples;
class Array_RowSum
{
	static void sumofRow(int matrix[][], int row, int column)
	{
		int i,j;

		for(i=0;i<row;i++)
		{
			int sum=0;
			for(j=0;j<column;j++)
			{
				sum+=matrix[i][j];
			}
			System.out.println("The Sum of Rows= "+sum);
		}
	}
	public static void main(String[] args)
	{
		int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		sumofRow(matrix, 4,4);
	}
}