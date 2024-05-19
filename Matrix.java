package array_examples;
import java.util.*;
public class Matrix
{ 
	public static void main(String x[])
   {  
	Scanner xyz  = new Scanner(System.in);
	
      int a[][]=new int[3][3];
      int b[][]=new int[3][3];
      int c[][]=new int[3][3];
      
      System.out.println("Enter Elements in First Matrix:");
      for(int i=0; i<a.length;i++)
      {
		  for(int j=0; j<a[i].length; j++)
         {
             a[i][j]=xyz.nextInt();
         }
      }
    System.out.println("Display Matrix Elements: ");
    for(int i=0; i<a.length;i++)
      {
		  for(int j=0; j<a[i].length; j++)
         {
             System.out.printf("\t"+a[i][j]);
         }
		System.out.printf("\n");
      }
    
    System.out.println("Enter Elements in Second Matrix: ");
    for(int i=0;i<b.length;i++)
    {
    	for(int j=0;j<a[i].length;j++)
    	{
    		b[i][j]=xyz.nextInt();
    	}
  
    }
    System.out.println("Display Matrix Elements: ");
    {
    	for(int i=0;i<b.length;i++)
    	{
    		for(int j=0;j<b[i].length;j++)
    		{
    			System.out.printf("\t"+b[i][j]);
    		}
    		System.out.println("\n");
    	}
    }   
  }
}