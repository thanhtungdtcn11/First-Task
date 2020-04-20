

public class Solution {
    static void buildMaxHeap(int[] input, int heapSize) {
        int depth = (heapSize - 1) / 2;
        for (int i = depth; i >= 0; i--) {
        	sinkMax(input, i, heapSize);
        }
        
    }

    static void sinkMax(int[] input, int i, int heapSize) {
    	
    	while ((2*i + 1) <= (heapSize - 1))
    	{
    		int j = 2*i + 1;
    		if (j < (heapSize - 1) && (input[j] < input[j+1])) j++;
    		if (input[j] < input[i]) break;
    		swap(input, i, j);
    		i = j;
 
    	}      
    }

    static void buildMinHeap(int[] input, int heapSize) {
        int depth = (heapSize - 1) / 2;
        for (int i = depth; i >= 0; i--) {
            sinkMin(input, i, heapSize);
        }
    }

    static void sinkMin(int[] input, int i, int heapSize) {
    	
    	while ((2*i + 1) <= (heapSize - 1))
    	{
    		int j = 2*i + 1;
    		if (j < (heapSize - 1) && (input[j] > input[j+1])) j++;
    		if (input[j] > input[i]) break;
    		swap(input, i, j);
    		i = j;
 
    	}      
    }

    static void swap(int[] input, int i, int j) {
        if (i == j)
            return;
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
    public static void main(String[] args) {
    	int[] a = {6, 10, 2, 6, 5, 0, 6, 3, 1, 0, 0};
        int n = 11;
        int[] minHeap = new int[n];
        int[] maxHeap = new int[n];
        int minHeapSize = 0;
        int maxHeapSize = 0;

        float currentMedian = 0;

        for (int a_i = 0; a_i < n; a_i++) {
            if ((maxHeapSize == 0) || (a[a_i] < currentMedian))  {
                maxHeap[maxHeapSize++] = a[a_i];
                // making sure the max heap has maximum value at the top
                if (maxHeap[maxHeapSize - 1] > maxHeap[0]) {
                    swap(maxHeap, maxHeapSize - 1, 0);
                    
                }
            } else {
                minHeap[minHeapSize++] = a[a_i];
                // making sure the min heap has minimum value at the top
                if (minHeap[minHeapSize - 1] < minHeap[0]) {
                    swap(minHeap, minHeapSize - 1, 0);
                    
                }
            }

            // if the difference is more than one
            if (Math.abs(maxHeapSize - minHeapSize) > 1) {
                if (maxHeapSize > minHeapSize) {
                    swap(maxHeap, maxHeapSize - 1, 0);
                    minHeap[minHeapSize++] = maxHeap[--maxHeapSize];
                    swap(minHeap, 0, minHeapSize - 1);
                    buildMaxHeap(maxHeap, maxHeapSize);
                } else {
                    swap(minHeap, minHeapSize - 1, 0);
                    maxHeap[maxHeapSize++] = minHeap[--minHeapSize];
                    swap(maxHeap, 0, maxHeapSize - 1);
                    buildMinHeap(minHeap, minHeapSize);
                }
            }

            // calculate the median
            if (maxHeapSize == minHeapSize) {
                currentMedian = (minHeap[0] + maxHeap[0]);
                currentMedian = currentMedian / 2;
            } else if (maxHeapSize > minHeapSize) {
                currentMedian = maxHeap[0];
            } else {
                currentMedian = minHeap[0];
            }

           System.out.println(currentMedian);
            
        }


        for (int z = 0; z <  6; z++)
        {
        	 System.out.print(minHeap[z] + " ");
        	 
        }
        System.out.println( " ");
        for (int y = 0; y <  6; y++)
        {
        
        	
        	 System.out.print(maxHeap[y] + " ");
        }


    }


}