package Datastruct;

import java.util.Arrays;

public class binarySearch {
	public static int solution(int[] arr, int n) { // arr의 배열에서 n을 찾는다.
		
		Arrays.sort(arr);
		
		int start = 0;//시작
		int end = arr[arr.length-1];//끝
		
		while(start <= end) {

			int sum = 0;
			int mid = (start+end)/2;
			
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] > mid)
					sum += mid;
				else
					sum += arr[i];
			}
			if(sum > n)
				end = mid -1;
			else
				start = mid +1;
		}
		return end;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,1,123,231,243,324,2,21,12,2};
		
		System.out.println(solution(arr, 12));
		
		
		
	}
}
