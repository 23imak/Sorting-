
public class SelectionSort {

	 private int[] array;
	 private int[] tempSArr;
	 
	  public SelectionSort(int[] array){
	    	 this.array = array;
	    	 
	    	 
	     }
	  public int[] sort() {
	    	int length;
	        length = array.length;
	        this.tempSArr = new int[length];
	        doSelectionSort(array);
	        return array;
	    }
	  public static void doSelectionSort(int[] arr){
	         
	        for (int i = 0; i < arr.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < arr.length; j++)
	                if (arr[j] < arr[index])
	                    index = j;
	      
	            int smallerNumber = arr[index]; 
	            arr[index] = arr[i];
	            arr[i] = smallerNumber;
	        }
	        
	    }
	
}
