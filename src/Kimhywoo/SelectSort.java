package Kimhywoo;

import java.util.Scanner;

public class SelectSort {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      long[] number = new long[100];
      long temp = 0;
      int pp=0;
      for (String i : s.nextLine().split(" ")) {
         number[pp] = Long.parseLong(i);
         pp++;
      }
      
      int indexMin;
      for (int i = 0; i < pp-1; i++) {        
         indexMin = i;
         for (int j = i + 1; j < pp; j++) {  
                if (number[j] < number[indexMin]) {          
                    indexMin = j;
              }       
         }
                 temp = number[indexMin];        
                 number[indexMin] = number[i];
                 number[i] = temp;
             
            for (int a = 0; a < pp; a++) {
               System.out.print(number[a]+ " ");
            }
            System.out.print(" : "+ number[indexMin]+" <-> " +number[i]);
            System.out.println();
      }
      }
      
      
      
      
      
      
      
   }
