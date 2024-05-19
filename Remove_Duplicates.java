package string;
import java.util.*;
import java.util.StringJoiner;

class Remove_Duplicates
{
	static String removeDuplicate(char str[], int n)
	{
		// Used as index in the modified string
		int index = 0;

		// Traverse through all characters
		for (int i = 0; i < n; i++)
		{
			int j;
			for (j = 0; j < i; j++) 
			{
				if (str[i] == str[j])
				{
					break;
				}
			}
			if (j == i) 
			{
				str[index++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str, index));
	}

	// Driver code
	public static void main(String[] args)
	{
		char str[] = "Dattatray".toCharArray();
		int n = str.length;
		
		System.out.println("Length of Characters:"+n);
		System.out.println("After Removing Duplicates Values:");

		System.out.println(removeDuplicate(str, n));
	}
}