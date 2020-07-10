package com.programmers.level2.practice;

import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxMinNum {

	public static void main(String[] args) {
		String a="1 2 3 -4";
		String[] tmp=a.split(" ");
		int[] arr=new int[tmp.length];
		
		for(int i=0; i<tmp.length; i++) {
			arr[i]=Integer.parseInt(tmp[i]);
		}
		Arrays.sort(arr);
		String answer="";
		answer+=arr[0]+" "+arr[arr.length-1];
		System.out.println(answer);
	}

}
