/**
 * Coursera - Algorithms Part I
 * Week 1 - Interview Questions - Analysis of Algorithms
 *
 * Question 1: 3-SUM in quadratic time
 *
 * Design an algorithm for the 3-SUM problem that takes time proportional to N2
 * in the worst case. You may assume that you can sort the N integers in time
 * proportional to N2 or better.
 */

/**
 * Solution:
 *
 * Create a array: N integers.
 * Sort the array.
 * member. Add unions between sites in time order of friendships being formed.
 * After each union is added, check the number of connected components
 * within the union-find data structure. If only one, all members are connected.
 *
 * Must keep track of number of unique components. Decreases when a union occurs
 * between different components.
 */

/**
 * Determine when all members of a social network are connected.
 */
public class ThreeSum {
	/**Sub-Functions
	 * public static void Sum(int[] a) to 
    */
    public static void Sum(int[] a)
    {
    	int sum;
    	ShellSort.Sort(a);
    	for(int i = 0; i < (a.length - 2); i++)
    	{
    		int j = i+1;
    		int k = a.length - 1;
    		while (j < k)
    		{
    			sum = a[i] + a[j] + a[k];
    	        if (sum == 0) {
    	            System.out.println(i + ":" + a[i] + ", " + j + ":" + a[j] + ", " + k + ":" + a[k]);
    	          }    	
    	        if (sum >= 0)
    	        {
    	        	--k;
    	        }else
    	        {
    	        	++j;
    	        }
    			
    		}
    		
    	}

    }
    
	public static void main(String[] args) 
	{
		int[] array = {30, -40, -20, -10, 40, 0, 10, 5};
		Sum(array);
	}
	
}
