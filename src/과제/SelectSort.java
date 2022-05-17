package 과제;

import java.util.Scanner;

public class SelectSort {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int[] number = new int[100];
      int temp = 0;
      int pp=-1;
      for (String i : s.nextLine().split(" ")) {
    	  pp++;
         number[pp] = Integer.parseInt(i);
       
      }
      double avg = 0;
      
    
      if(number[pp] == 1) {
    	  avg = number[0] * number[0]*3.14;
      }else if(number[pp] == 2) {
    	  avg = number[0] * number[1]*0.5;
      }else {
    	  avg = (number[0]+number[1])*number[2]*0.5;
      }
      
      System.out.printf("%.1f",avg);
      
      
      
      
      
      
      
   }

}