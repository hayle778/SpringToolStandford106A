package week6;

import java.lang.reflect.Array;

import acm.program.ConsoleProgram;
import acmx.export.java.util.Scanner;
// create a method that tells us if it is more than the element container and return a null value



public class  ExpandableArray extends ConsoleProgram {
	
  private Object[] array1 = new Object[22];
	
   
  Scanner input =new Scanner(System.in);

  
   
  
  public Object laoo() {

	   
	  // Scanner input =new Scanner(System.in);
	   
	   println ("Enter a number" ); 
	  
	   int x = input.nextInt();
	   
	   if( x <= 25 || x > 45 ) {
		   
	     return null;

	   }
   
	   else {
		   
		   
		   // check the return method to array1
		   
		   return laoo();
	   }
   
   
   
   
   }



public void setArray1(Object[] array1) {
	
	this.array1 = array1;
}



public void run() {
	
	   
	            int[] loop = new int[10];
   
                        loop[0]=12;
                        loop[1]=13;
                        loop[3]=15;
	                    loop[9]=17; 
	                    loop[3]=14;
	      
	            println ("The array result of the index loop : "+ loop.length);
	            
	            
	           String [] loop2 = {"Ds","Sf", "Fd","Df","Df","Tt"};
   
               
	           println("The array result of the index  loop2 : " + loop2.length);
   
  
                 // The addition of both loops
         
             
               int ConcatAll = loop.length+loop2.length+ array1.length;
              
                          println("The concat of loop1 + loop2 + array1 is: " + ConcatAll);
          
             
               for(int i = 0; i < array1.length; i++) {
             
            	 int total = 0;
            	 total += array1.length;
                 
            	
            	 int total2 = 0;
            	 total2 += loop2.length;
            	
            	 int total3 =0;
            	 total3 += loop.length;
            	 
          
            	
            	 int  k = i + total2 + total;
            	
                 println(k);
            
            	// k is the one listed the index start from 26 to 45;
            	 
             }
   
      /*         
               int k = 0;
              
               if( k <=25 || k > 45) {
            	   
            	   return ;
            	   
               }
   
               else {
            	   
            	   println(k);
            	   
            	   //return k;
               }*/

   }
   
    
           }

        
	

	
	
	
	

	

	
	
	
	

