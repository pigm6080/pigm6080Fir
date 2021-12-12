package javaswingP;

public class asd extends Thread{
	public static void main(String[] args) {
		
		try {
			for(int i = 0; i<10 ; i++) {
				Thread.sleep(1000);
				System.out.println(Integer.toString(i));
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
