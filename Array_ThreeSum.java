package array_examples;
import java.util.*;

public class Array_ThreeSum {
	private static List<List<Integer>> threesum(int[] nums) {
		Set<List<Integer>> result= new HashSet<>();
		int n = nums.length;
		
		for(int i=0;i<n-2;i++)
		{
			for(int j = i+1; j< n-1; j++)
			{
				for(int k=i+2; k<n; k++)
				{
					if(nums[i] + nums[j] + nums[k] == 0)
					{
						List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
						Collections.sort(triplet);
						result.add(triplet);
					}
				}
			}
		}
		return new ArrayList<>(result);
	}
	
public static void main(String[] args) {
	int[] nums = {-1, 0, 1 ,2, -1, -4};
	System.out.println(threesum(nums));
	}
}