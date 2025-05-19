package collection_list_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_Application_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Integer> ar=new ArrayList<>();
			int i=0;int j=0;
			int choise=0;
			System.out.println("Welcome To using Application: I am Build using ArrayList in collection.");

			do {
				System.out.println("Enter Your Choise Number between 1 to 10:");
				choise=sc.nextInt();

				switch(choise)
				{
				case 1:
					System.out.println("Add 10 Values in ArrayList:");
					ar.add(10);
					ar.add(20);
					ar.add(30);
					ar.add(40);
					ar.add(50);
					ar.add(60);
					ar.add(70);
					ar.add(80);
					ar.add(90);
					ar.add(100);
					System.out.println("Data Added Successfully...");
					break;

				case 2:
					System.out.println("Display the Elements:");
					System.out.println("The Size of elements:"+ar.size());
					System.out.println("Display Elements: \n"+ar);
					break;

				case 3:

					System.out.println("Add Data in Specific Address:");
					int dt=sc.nextInt();
					ar.add(dt);
					break;

				case 4:
					System.out.println("Search the Elements:");
					System.out.println("Enter the Elements:");
					int sk=sc.nextInt();
					boolean b=ar.contains(sk);
					if(b)
					{
						System.out.println("Data Found.");
					}
					else
					{
						System.out.println("Data Not Found.");
					}
					break;

				case 5:
					System.out.println("Sort The Array in Ascending Order:");
					for(i=0;i<ar.size();i++)
					{
						for(j=i+1;j<ar.size();j++) {
							
						}
						{
							if(ar.get(i)<ar.get(j))
							{
								int temp=ar.get(i);
								ar.set(i, ar.get(j));
								ar.set(j,temp);
							}
						}
					System.out.println("Strted ArrayList Are: "+ar);
					}
					break;

				case 6:
					System.out.println("Sort the Arraylist in Decsending Order:");
					break;

				case 7:
					int max=Collections.max(ar);
					System.out.println("Find Maximum Elelemnts: "+max);
					break;

				case 8:
					int min=Collections.min(ar);
					System.out.println("Find Minimum Elements: "+min);
					break;

				case 9:
					System.out.println("Update the ArrayList Elements: ");
					System.out.println("Enter the Index for Update the elements: ");
					int in=sc.nextInt();
					System.out.println("Enter the Value for Update the Elements: ");
					int val=sc.nextInt();
					ar.set(in, val);
					System.out.println("Value Update successfully...");
					break;

				case 10:
					System.out.println("Remove the index in ArrayList");
					int v2=sc.nextInt();
					ar.remove(v2);
					System.out.println("Value removed Sucessfully...");
					break;
				default:
					System.out.println("Thank you for Using...your request cannot proceed.");
				}
			} while (choise<=11);
		}
	}
}
