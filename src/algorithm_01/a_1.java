package algorithm_01;

public class a_1 {
	public static void rotate(int[][] matrix, int numColumns, char direction) {
		
		for(int u =0 ; u<numColumns; u++) {
		if(direction == 'l') {
			
			for (int i = 0; i < matrix.length; i++) {	
					int temp = matrix[i][0];
				    for(int a =1; a<=matrix[i].length-1;a++){
				    	matrix[i][a-1] = matrix[i][a];
				    }
				    matrix[i][matrix[i].length-1] = temp;
				}
		}else {
			for (int i = 0; i < matrix.length; i++) {	
				 int temp = matrix[i][matrix[i].length-1];
				    for(int j =matrix[i].length-1;j>=1;j--){
				    	matrix[i][j] = matrix[i][j-1];
				    }
				    matrix[i][0] = temp;
			}
		}
	}
}
	
	public static void main(String[] args) {
		int arr[][] = new int[][] {
			{1,3,5,7,9},
			{1,2,3},
			{10,20,30,40,50,60},
			{7,1},
			{2,4,6,8}
		};
		
		rotate(arr, 3, 'l');
		
		for (int[] is : arr) {
			for (int a : is) {
				System.out.print(a);
				
			}
			System.out.println();
			
			
		}
		
	}
}
