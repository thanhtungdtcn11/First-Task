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
public class ThreeSumBinary {
	/**Sub-Functions
	 * public static void Sum(int[] a) to 
    */
	public static int binarySearch(int[] a, int key)
	 {
	 int lo = 0, hi = a.length-1;
	 while (lo <= hi)
	 {
	 int mid = lo + (hi - lo) / 2;
	 if (key < a[mid]) return -1;
	 else if (key > a[mid]) lo = mid + 1;
	 else return mid;
	 }
	 return -1;
	 }
    public static void Sum(int[] a)
    {
    	ShellSort.Sort(a);
    	for(int i = 0; i < (a.length - 2); i++)
    	{   		
    		for (int j = i+1; j < (a.length - 1); j++)
    		{
    			int key = -(a[i] + a[j]);
    			int find = binarySearch(a,key);
    			if (find != -1 && find > i && find > j)
    			{
    				System.out.println(i + ":" + a[i] + ", " + j + ":" + a[j] + ", " + find + ":" + a[find]);
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


