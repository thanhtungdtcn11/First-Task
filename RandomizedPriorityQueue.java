import java.util.Random;

public class RandomizedPriorityQueue {
	
	private static int sample(int N)
	{
        Random r = new Random();       
		return  r.nextInt(N) + 1; 	
	}
	
	
	private static void swim(int[] a, int k)
	{
		while (k > 1 && (a[k/2] < a[k] ))
		{
			exch(a,k,k/2);
			k = k/2;
		}
		
	}
	
	private static void sink(int[] a, int k , int sinkSize)
	{
		while ( 2*k <= sinkSize)
		{
			int j = 2*k;
			if ((j < sinkSize) && (a[j] < a[j+1])) j++;
			if (a[k] > a[j]) break;
			exch(a,k,j);
			k = j;
		}
		
	}
	
	private static void exch(int[] input, int i, int j) {
        if (i == j)
            return;
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
    
	private  static void delRandom( int[] a, int x, int Size)
	{
		if (x != Size) 
		{
		exch(a,x, Size--);
		sink(a,x,Size);
		// swim(a,x);
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {0,9,7,8,4,3,6,5,1};
		int key = sample(array.length - 1 );
		delRandom(array, key, array.length -1 );
		for (int m = 0 ; m <  array.length; m++)
			System.out.print(array[m] + " ");
	}
}
