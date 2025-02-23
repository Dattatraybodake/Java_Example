package array_examples;
public class Array_Sliding_Window {
	private static void printMax(int arr[], int N, int K)
    {
        int j, max;
        for (int i = 0; i <= N - K; i++) {
            max = arr[i];
            for (j = 1; j < K; j++) {
                if (arr[i + j] > max) {
					max = arr[i + j];
				}
            }
			System.out.println("The Maximum Number in "+K+" number group is: "+max+"\n");
        }
    }
	
	public static void main(String[] args) {
     int[] arr = {1, 3, 6, 21, 4, 9, 12, 3, 16, 10};
	 int k=3;
	 System.out.println("The length of each subarray is:"+k);
	 printMax(arr,arr.length,k);
	}
}