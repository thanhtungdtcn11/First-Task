
public class BitonicArrayBinary {		
	private static int binarySearchPeak(int[] array, int start, int end) {
		    int mid = (start + end) / 2;
		    if (start == end) {
		      return mid;} 
		    else if (array[mid] < array[mid+1]) {
		      return binarySearchPeak(array, mid+1, end);} 
		    else {
		      return binarySearchPeak(array, start, mid);}
		  }	
	public static int binarySearch_left(int[] array, int start, int end, int target)
	 {
	    int mid = start +  (end - start) / 2;
	    if (start <= end) {
	    	if (target < array[mid]){
	    		return binarySearch_left(array, start, mid - 1, target);}
	        else if (target > array[mid]) {
	    	    return binarySearch_left(array, mid + 1, end, target);}
	        else return mid;   	
	    }
		return -1; 
	 }		
	public static int binarySearch_right(int[] array, int start, int end, int target)
	 {		
	    int mid = start +  (end - start) / 2;
	    if (start <= end) {
	    	if (target < array[mid]){
	    		return binarySearch_right(array, mid + 1, end, target);}
	        else if (target > array[mid]) {
	        	return binarySearch_right(array, start, mid - 1, target);}
	        else return mid;   	
	    }
		return -1; 
	 }	
	
	 public static void main(String[] args) {
		    int[] array = { 1, 2, 3, 4, 5, 15, 10, 9, 8, 7, 6,5 };
		    int target = 5;
		    int peak = binarySearchPeak(array, 0, array.length-1);
		    System.out.println(peak);
		    int find_left = binarySearch_left(array,0, peak,target);
		    System.out.println(find_left);
		    int find_right = binarySearch_right(array,peak, array.length - 1,target);
		    System.out.println(find_right);
		  }
}
