package com.programmers.level1.stringSort;

import java.util.*;

public class StringSort {
	public static String[] solution(String[] strings, int n) {
		String[] answer=new String[strings.length];
		char[] tempChar=new char[strings.length];
		
		for(int i=0; i<strings.length; i++) {
			tempChar[i]=strings[i].charAt(n);
		}
		
		Arrays.sort(tempChar);
		for(int i=0; i<tempChar.length; i++) {
			System.out.println(tempChar[i]);
		}
		for(int i=0; i<tempChar.length; i++) {
			
			for(int j=0; j<strings.length; j++) {
				if(tempChar[i]==strings[j].charAt(n)) {
					answer[i]=strings[j];
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
//		String[] strings= {"sun", "bed", "car"};
		String[]strings= {"abce", "abcd", "cdx"};
		int n=1;
		String[]out=solution(strings, n);
		Arrays.sort(strings);
		for(int i=0; i<out.length;i++) {
			System.out.print(out[i]+", ");
//			System.out.println(strings[i]);
		
		}
	}

}
