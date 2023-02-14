package week3.day2;

public class Palindrom {
	public static void main(String[] args) {
		
	
         String a="MOM";
         //to convert the string into character
         char[] b =a.toCharArray();
         //System.out.println(b);
         int len=b.length;
         //declare empty string
         String  rev="";
         for(int  i=len-1;i>=0;i--) {
        	  rev=rev+b[i];
        	  //System.out.println(rev);
        	  
         } 
         
         if (a.equals(rev)){
        	 System.out.println("IT IS A PALINDROM");
         }
         else {
        	 System.out.println("IT IS NOT A PALINDROM");         }
	}
	   		 
	}


