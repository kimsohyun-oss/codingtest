package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number2 = sc.nextInt();
		
		int[] number = new int[number2];
		for(int i=0;i<number.length;i++) {
			number[i]=sc.nextInt();
		}
	
		ArrayList<Integer> numberAr = new ArrayList<Integer>();
		for(int i = 0; i< number.length;i++) {
			if(!numberAr.contains(number[i])) {
				numberAr.add(number[i]);
			}		
		}
		numberAr.sort(null);
		for(int i =0;i<numberAr.size();i++) {
			System.out.println(numberAr.get(i));
		}
		
		
	}

}
