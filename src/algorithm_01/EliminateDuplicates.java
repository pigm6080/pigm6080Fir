package algorithm_01;
import java.util.*;
public class EliminateDuplicates {

	 public static String[] eliminateDuplicates(String str) {
		   String[] newString = new String [] {"",""};
		   for(int i = 0; i < str.length(); i++) {
		       char element = str.charAt(i);
		       if (!newString[0].contains(element+"")){
		      newString[0] += element;
		       }else if(newString[0].contains(element+"")) {
		    	   newString[1] += element;
		       }
		   }
		   return newString;
		    }
		     
		public static void main(String [] args) {
		    System.out.print("Contains sequence 'abrcadabra': ");
		    String[] retStrings1 = eliminateDuplicates("abrcadabra");
		    System.out.println(retStrings1[0]+","+retStrings1[1]);
		    
		    System.out.print("Contains sequence 'Stony Brook University': ");
		    String[] retStrings2 = eliminateDuplicates("Stony Brook University");
		    System.out.println(retStrings2[0]+","+retStrings2[1]);
		    
		    System.out.print("Contains sequence 'This is a test sentence.': ");
		   	String[] retStrings3 = eliminateDuplicates("This is a test sentence.");
		    System.out.println(retStrings3[0]+","+retStrings3[1]);
		    
		    System.out.print("Contains sequence ' I like roses.' : ");
		    String[] retStrings4 = eliminateDuplicates("I like roses.");
			System.out.println(retStrings4[0]+","+retStrings4[1]);
			    
		        System.out.print("Contains sequence ' Amy likes a milk candy.' : ");
		        String[] retStrings5 = eliminateDuplicates("Amy likes a milk candy.");
			    System.out.println(retStrings5[0]+","+retStrings5[1]);
		          
		}

		}
		    