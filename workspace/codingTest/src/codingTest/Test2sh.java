package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2sh{

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int num = sc.nextInt();
    
      ArrayList<String> splitAr= new ArrayList<String>();
   
      for(int i=0; i<num;i++) {
         splitAr.add(sc.next());
      }
   
      for(int z=0; z<num;z++) {
         int score=0;
         int a =0;
         for(int i=0; i<splitAr.get(z).split("").length;i++) {
            if(splitAr.get(z).split("")[i].equals("O")){
               score=score+(++a);
            }else if(splitAr.get(z).split("")[i].equals("X")) {
               a=0;
            }
        }
         
         System.out.println(score);
      }
   
      
      
      
   }

}