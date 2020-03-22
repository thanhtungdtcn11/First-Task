
public class ThreeSumRecursive {
  private static int bitonicSearch(int[] array, int start, int end, int target) {
	
    int mid = start +  (end - start) / 2;
    if (start <= end) {
    	if (target < array[mid])
    		{
    		return bitonicSearch(array, start, mid - 1, target);
    		}
        else if (target > array[mid]) 
            {
    	    return bitonicSearch(array, mid + 1, end, target);
            }
        else return mid;   	
    }
	return -1; 
  }
	public static void main(String[] args) 
	{
		int[] array = {30, -40, -20, -10, 40, 0, 10, 5};
		ShellSort.Sort(array);
		for(int i=0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
			
		}
		System.out.println("");
		System.out.println(bitonicSearch(array, 0 ,array.length-1, -70));
	}
	
}