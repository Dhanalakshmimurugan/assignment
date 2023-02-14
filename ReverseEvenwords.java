package week3.day2;

public class ReverseEvenwords {
	public static void main(String[] args) {
		String a="I AM A SOFTWARE TESTER";
		String[] split=a.split(" ");
		for(int i=0;i<split.length;i++) { 
			//if( i%2==1) {
				char[]b=split[i].toCharArray();
				for(int j=b.length-1;j>=0;j--) {
					System.out.print(b[j]);
				}
			   //}else {
					System.out.print(" ");
					//System.out.print(split[i]+" ");
					
					
			}
		}
		
	}

//}

