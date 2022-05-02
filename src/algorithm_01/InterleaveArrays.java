package algorithm_01;

public class InterleaveArrays {
	public static int[] interleaveArrays(int[] array1, int[] array2) {
		int sum =array1.length+array2.length;
		int temp[] = new int[sum];
		int a1=0,a2=0;
		for(int i =0;i<sum;i++) {
			if(i%2==0) {
				temp[i] = array1[a1];
				a1++;
			}else {
				temp[i] = array2[a2];
				a2++;
			}
			
		}
		return temp;
	}	
	 public static int[] mergeArrays(int[] array1,int[] array2) {
		 int sum = array1.length+array2.length;
		 int temp[] = new int[sum];
		 for (int i = 0; i < array1.length; i++) {
			 temp[i] = array1[i]; 
	     }
		 for (int i = 0; i < array2.length; i++) {
			 temp[i + array1.length] = array2[i]; 
	     }
		 
		 for(int i = 0; i < temp.length; i++) {
		        for(int j = 0 ; j < temp.length - i - 1 ; j++) {
		            if(temp[j] > temp[j+1]) {
		                int tmp = temp[j+1];
		                temp[j+1] = temp[j];
		                temp[j] = tmp;
		            }
		        }
		    }
		 return temp;
	 }
	
	 
	 
	 
	public static void main(String[] args) {
		System.out.println("part1");
		for (int a : interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6})) {
			System.out.print(a+" ");
		}
		System.out.println();
		for (int a : interleaveArrays(new int[]{10,20,30,40}, new int[]{2,4,6,8}))  {
			System.out.print(a+" ");
		}
		System.out.println();
		for (int a : interleaveArrays(new int[]{123,10,230,41}, new int[]{2,1,3,4}))  {
			System.out.print(a+" ");
		}
		System.out.println();
		for (int a : interleaveArrays(new int[]{120,30,330,44}, new int[]{5,6,2,1}))  {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("part2");
		for (int a : mergeArrays(new int[]{2,5,15,20,25,40}, new int[]{10,20,30,40})) {
			System.out.print(a+" ");
		}
		System.out.println();
		for (int a : mergeArrays(new int[]{1,11,31,45,77,78,79,101}, new int[]{2,5,12,80,103,120})) {
			System.out.print(a+" ");
		}
		System.out.println();
		for (int a : mergeArrays(new int[]{2,43,321,15,33,22,34,90}, new int[]{8,7,32,42,34,56})) {
			System.out.print(a+" ");
		}
		System.out.println();
		for (int a : mergeArrays(new int[]{5,6,123,11,332,113,11,1111}, new int[]{3,12,1,32,12,234})) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
}
