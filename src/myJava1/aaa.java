package myJava1;

import java.util.Scanner;

public class aaa {
	
    public static String addBinaryNonPlus(String a, String b) {

        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);

        return Integer.toBinaryString(addBin(aInt, bInt));
    }
    
   
    public static int addBin(int a, int b) {
        if(b == 0) return a;
       
        int sum = a^b;

      
        int carry = (a&b) << 1;

        return addBin(sum, carry);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("본인의 학번입력 :  ");
		int n = s.nextInt();
		String bia = Integer.toBinaryString(n);
		System.out.print("데이터 : ");
		String[] st = new String [7];
		for (int j=0,i = 0; i < 28; j++,i+=4) {
			
			st[j] = bia.substring(i,i+4);
			System.out.print(st[j] + " ");
			
		}
		int num[] = new int[7]; 
		System.out.println();
		int sum1=0;
		System.out.print("       ");
		for (int i = 0;i <st.length; i++) {
			int sum = 0;
			num[i] = Integer.parseInt(st[i],2);
			System.out.print(num[i] + "   ");	
			sum1 += num[i];
		}
		System.out.println("== "+sum1);
				

		String h = Integer.toBinaryString(sum1);
		int num3[] = new int[2];
		String[] st1 = new String [2];
		st[1] = h.substring(h.length()-4,h.length());
		st[0] = h.substring(0,h.length()-4);
		
		System.out.print(st[0] + " ");
		System.out.println(st[1] + "=");
		int num5=Integer.parseInt(addBinaryNonPlus(st[0],st[1]));
		String o = addBinaryNonPlus(st[0],st[1]);
		String cnt[] = new String[2];
		int num6 =addBinaryNonPlus(st[0],st[1]).length();
		if(num6>4) {
			cnt[1] =o.substring(o.length()-4,o.length());
			cnt[0] =o.substring(0,o.length()-4);
		}else {
			cnt[0] = o.substring(0,o.length());
		}
		
		int y;
			if(num6>4) {
				 y = Integer.parseInt(cnt[1])+Integer.parseInt(cnt[0]);
				 y = 1111-y;
			}else {
			
				 y = Integer.parseInt(cnt[0]);
				
			}
			System.out.println("\n최종값은");
			System.out.println(y);
		}
		
	
	
	
}

