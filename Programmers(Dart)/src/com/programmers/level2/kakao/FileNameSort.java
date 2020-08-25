package com.programmers.level2.kakao;

import java.util.Arrays;
import java.util.Comparator;

public class FileNameSort {

	 public static String[] solution(String[] files) {
		 Arrays.sort(files, new Comparator<String>() {
			 
			@Override
			public int compare(String o1, String o2) {
				String[] arr1=div(o1);
				String[] arr2=div(o2);
				int head=arr1[0].compareTo(arr2[0]);
				if(head==0) {
					return Integer.parseInt(arr1[1])-Integer.parseInt(arr2[1]);
				}
				return head;
			}
			
			
			 private String[] div(String s) {
				 String[] arr=new String[3];
				 for(int i=0; i<arr.length; i++) {
					 arr[i]="";
				 }
				 s=s.toLowerCase();
				 int i=0;
				 for(; i<s.length(); i++) {
					 if(s.charAt(i)>='0' && s.charAt(i)<='9') {
						 break;
					 }
					 arr[0]+=s.charAt(i)+"";
				 }
				 for(; i<s.length(); i++) {
					 if(!(s.charAt(i)>='0' && s.charAt(i)<='9')) {
						 break;
					 }
					 arr[1]+=s.charAt(i)+"";
				 }
				 arr[2]=s.substring(i);
				 //System.out.println(s+"\n"+arr[0]+" "+arr[1]+" "+arr[2]);
				 return arr;
			 }
			
			
		});
		 return files;
		 
	 }

		 public static void main(String[] args) throws Exception{
			 String[] files= {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
			 String[] arr=solution(files);
			 for(String a: files) {
				 System.out.println(a);
			 }
	}

}
