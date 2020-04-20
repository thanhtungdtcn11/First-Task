

/**
 * Created by Leon on 7/12/15.
 */
public class Mergesort_ {
    /*
    Question 1
    Merging with smaller auxiliary array.
    Suppose that the subarray a[0] to a[N-1] is sorted and the subarray a[N] to a[2*N-1] is sorted.
    How can you merge the two subarrays so that a[0] to a[2*N-1] is sorted using an auxiliary array of size N (instead of 2N)?
     */

    public static void mergeWithSmaller(int[] a, int[] aux) {
        int N = aux.length;
        assert a.length == 2*N;

        for (int i = 0; i < N; i++) {
            aux[i] = a[i];
        }

        int l = 0;
        int r = N;

        int i = 0;


        while (l < N) {
            if (r >= 2*N || (aux[l] < a[r]) ) a[i++] = aux[l++];
            else a[i++] = a[r++];
        }
    }
    public static void main(String[] args) {

        int[] a = {15, 16, 19, 20, 22, 2, 3, 4, 6, 10};
        int N = a.length / 2;
        int[] au = new int[N];
        mergeWithSmaller(a,au);
        for (int x =0 ; x < a.length; x++)
        {
        	System.out.print(a[x] + " ");
        }
        
    }
}