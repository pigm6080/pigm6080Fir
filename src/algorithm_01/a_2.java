package algorithm_01;

public class a_2 {
	public static void swapColumns(String[][] array, int col1, int col2) {
		if(array[0].length > col1 && 0 <= col1 && array[0].length > col2 && 0 <= col2) {
			
			for(int i = 0; i< array.length;i++) {
				String n = array[i][col1];
				array[i][col1] = array[i][col2];
				array[i][col2] = n;
			}
		}
	}
	
	public static void main(String[] args) {
		String[][] arr = new String[][] {
			{"C","D","B","A"},
			{"X","Y","Z","Q"},
			{"1","2","3","4"}
		};
		
		swapColumns(arr, 1, 3);
		
		for (String[] is : arr) {
			for (String a : is) {
				System.out.print(a);
				
			}
			System.out.println();
		}
		
	}
	

}