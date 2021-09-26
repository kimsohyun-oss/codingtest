package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
	
		System.out.println("계연풀이");
		   Scanner sc = new Scanner(System.in);
		   int num = sc.nextInt(); 
		   String [] quiz = new String[num+1];
		   for(int i=0; i<num; i++){
		     int count = 0;
		     int sum = 0;
		     quiz[i] = sc.next();
		     for(int j = 0; j<quiz[i].length(); j++){
		      if(quiz[i].charAt(j)=='O')  sum+= ++count;
		      else count = 0;
		     }
		     System.out.println(sum);
		   }
		   }

		
		
	}


