package Datastruct;

public class Selectionsort {
	void selectionSort(int[] arr) {
		int indexMin, temp;
		
		for(int i = 0; i<arr.length-1; i++) {
			indexMin = i;
			
			for(int j = i + 1; j < arr.length;j++) {
				if(arr[j] < arr[indexMin]) {
					indexMin = j;
				}
			}
			temp = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = temp;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
	}
}
