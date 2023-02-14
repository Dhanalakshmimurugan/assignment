package week3.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String a="stops";
		String b="posts";
		int len1=a.length();
		int len2=b.length();
		if(len1==len2) {
			char[]c=a.toCharArray();
			char[]d=b.toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			boolean arr=Arrays.equals(c, d);
		
			if(arr=true) {
				System.out.println("IT IS A ANAGRAM");
			}}else {
				System.out.println("IT IS NOT A ANAGRAM");
			}
		}
	   
	}


