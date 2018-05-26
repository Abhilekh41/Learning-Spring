package Code;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {

	public int search(int[] inputArr,int key)
	{
		int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return inputArr[mid];
            }
            if (key < inputArr[mid]) {
            	end = mid - 1;
            } else {
            	start = mid + 1;
            }
        }
        return -1;
	}
	public static void main(String args[])
	{
		BinarySearch binarySearch = new BinarySearch();
		int[] array = {1,2,3,4,5,6};
		int u = binarySearch.search(array,3);
		System.out.println(u);
		
	}
	
}
