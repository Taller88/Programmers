package com.programmers.level2.greedy;

public class JoyStickSolution {

	public static int solution(String name) {
		int[]arr=new int[name.length()];
		for(int i=0; i<name.length();i++) {
			System.out.println(name.charAt(i)-'A');
			if(name.charAt(i)-'A'<14) {
				arr[i]=name.charAt(i)-'A';
				System.out.println(arr[i]);
			}else {
				arr[i]='Z'-name.charAt(i)+1;
				System.out.println(name.charAt(i)-'A'+": "+arr[i]);
			}
		}
		int cnt=arr[0];
		if(name.length()>1) {
			if(arr[1]<arr[name.length()-1]) {
				for(int i=name.length()-1 ; i>0 ;i--) {
					cnt++;
					cnt+=arr[i];
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
//		System.out.println("JEROEN");
//		solution("JEROEN");
//		System.out.println("JAZ");
		System.out.println(solution("JAZ"));
		
	}

}
