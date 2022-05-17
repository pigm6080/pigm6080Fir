package 과제;

import java.util.Scanner;

public class mathcl {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double[] num = new double[105];
		double vg = 0,var = 0,std=0;
		int pp=0;
		for (String i : s.nextLine().split(" ")) {
			num[pp] = Double.parseDouble(i);
			vg += num[pp];	
			pp++;
		}
		vg = (double)vg/pp;
		
		for (int i = 0; i < pp; i++) {
			std += Math.pow((num[i]-vg),2);
		}
		var = (double)std/pp;
		var = Math.sqrt(var);
		
		System.out.printf("Mean: %.3f\n",vg);
		System.out.printf("Var: %.3f\n",std/pp);
		System.out.printf("Std: %.3f\n",var);
		
		
		
		
		
	}

}
