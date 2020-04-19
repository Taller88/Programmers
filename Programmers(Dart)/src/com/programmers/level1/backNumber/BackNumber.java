package com.programmers.level1.backNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class BackNumber {
	 public static int[] solution(long n) {
	      int[] answer = new int[(int)Math.log10(n)+1];
	      long input=n;
	      for(int i=0; i<answer.length; i++){
	    	  answer[i]=(int)input%10;
	    	  System.out.println(answer[i]);
	    	  input/=10;
	      }
	      return answer;
	  }
	public static void main(String[] args) {
	solution(12345);
	System.out.println("자릿수: "+ (int)(Math.log10(12345)+1));
	ArrayList<Long> test=new ArrayList<>();
	String a="a Bc";
	a=a.toLowerCase();
	System.out.println(a);
	System.out.println('A'+0);

	}

}
