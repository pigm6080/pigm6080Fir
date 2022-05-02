package algorithm_01;

public class ArrUtils {
	public static int[] randomArray (int a, int b){
		int[] array = new int [b];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*a);
		}
		return array; 
	}
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static int arrSum(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}
	public static Boolean contains(int a, int[] array) {
		Boolean result = false;
		for (int i : array) {
			if(i == a) {
				result= true;
			}
		}
		return result;
	}
	public static int indexof(int a, int[] array) {
		int cnt=1;
		for (int i : array) {
			if(i == a) {
				return cnt;
			}
			cnt++;
		}
		return -1;
	}
	 public static int countMultiplesOf ( int y,int [] arr) {
		   int count = 0;
		   for (int i = 0; i< arr.length; i++) {
		       if (isMulti(arr[i], y)){
		      count++;}
		   }
		   
		   return count;
		    }
	 public static boolean isMulti (int x, int y){  
	      if  (x%y==0){
	        return true;
	      }
	      return false;
	    }
	 public static int[] buildHistogram (int[] scores){
		   int[] histogram = new int[largeScore(scores)+1];
		   int count=0;
		   for (int i=0; i<scores.length;i++){
		       count= 0;
		       for (int j =0; j<scores.length;j++){
		      if(scores[i]== scores[j]){
		          count=count+1;
		      }
		       } histogram[scores[i]] =count;
		   }
		   return histogram;
		    }
	 public static int largeScore (int [] scores) {
		   int large = scores[0];
		   for (int i=0; i<scores.length; i++){
		       large= Math.max(large, scores[i]);
		   }
		   return large;
		    }
	 public static void printHistogram (int [] histogram) {
		 	for (int i = 0; i< histogram.length;i++){
	    	       System.out.printf("%d:%d",i,histogram[i]);
	    	for (int j=0; j<histogram[i];j++){
	    	      System.out.print('*');
	    	      }
	    	       System.out.println();
	    	  }
	    }   




	public static void main(String[] args) {
		int[] array = randomArray(21, 101);
		printArray(array);
		float avg = (float)arrSum(array)/array.length;
		System.out.printf("%.2f\n",avg);
		System.out.println(contains(14, array));
		System.out.println(indexof(14, array));
		System.out.println(countMultiplesOf(7,array));
		int[] histogram = buildHistogram(array);
		printHistogram (histogram);
		

	}
	
}
