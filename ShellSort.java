
public class ShellSort {
	public static void Sort(int[] a) {
	    if (a == null) return;
	    final int N = a.length;

	    int h=1;
	    while (h < N/3) {h=3*h+1;} // 1, 4, 13, 40, 121, 364, ...	3x+1 increment sequence
	    
	    
	    while (h >= 1)
	    { // h-sort the array.
	    for (int i = h; i < N; i++)
	    {
	    for (int j = i; j >= h && (a[j]< a[j-h]); j -= h)
	    exch(a, j, j-h);
	    }

	    h = h/3;
	    }
	  }
	private static void exch(int[] a, int i, int j)
	{
	    int tmp = a[i];
	    a[i] = a[j];
	    a[j] = tmp;
	}
	
	  public static void main(String[] args) {

		    int[] array = {10, 4, 6, 8, 13, 2, 3};
		    Sort(array);
		    System.out.println(java.util.Arrays.toString(array));

		  }	
}
