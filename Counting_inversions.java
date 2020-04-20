
public class Counting_inversions {
	
	// Function to count the number of inversions 
    // during the merge process 
    private static int mergeAndCount(int[] a , int[] aux, int lo, int mid, int hi) 
    {   
    	for (int k = lo; k <= hi; k++)
    	{
    		
    		aux[k] = a[k];
    	}
    	int i = lo;
    	int j = mid + 1;
    	int swaps = 0;
    	for (int k = lo; k <= hi; k++)
    	{
    		if (i > mid) a[k] = aux[j++];
    		else if (j > hi)  a[k] = aux[i++];
    	    else if (aux[j] < aux[i])
    		{
    			a[k] = aux[j++];
    			swaps += (mid + 1) - (lo + i);
    		}
    		else if (aux[j] > aux[i]) a[k] = aux[i++];
    	}
  
    	return swaps;
    	  	
    	
    } 
  
    
    
    // Merge sort function 
    private static int sortMergeAndCount(int[] a, int[] aux, int lo, int hi) 
    { 
  
        // Keeps track of the inversion count at a 
        // particular node of the recursion tree 
        int count = 0; 
  
        if (lo < hi)
        {
        	int mid = lo + (hi - lo)/2; 
        	  
            // Total inversion count = left subarray count 
            // + right subarray count + merge count 
  
            // Left subarray count 
            count += sortMergeAndCount(a, aux, lo, mid); 
  
            // Right subarray count 
            count += sortMergeAndCount(a, aux, mid + 1, hi); 
  
            // Merge count 
            count += mergeAndCount(a, aux, lo, mid, hi); 
        }

       
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] a = { 1, 20, 6, 4, 5 }; 
        int[] aux = new int[a.length];
  
        System.out.print(sortMergeAndCount(a, aux, 0, a.length - 1 )); 

    } 
}
