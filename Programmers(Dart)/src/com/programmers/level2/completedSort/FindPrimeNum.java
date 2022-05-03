package com.programmers.level2.completedSort;

import java.util.Arrays;
import java.util.HashSet;

public class FindPrimeNum {
	static String[] arr;
	static HashSet<Integer> set=new HashSet<>();
	public static boolean check(int x, int y){
		if(x<=1) {
			return false;
		}
//		if(x<17) {
//			if(y==1) {
//				return true;
//			}
//			
//			if(x%y==0) {
//				return false;
//			}
//			return check(x, y-1);
//		}
//		if(x%2==0){
//		     return false;
//		 }else if(x%3==0){
//		     return false;
//		 }else if(x%5==0){
//		     return false;
//		 }else if(x%7==0){
//		     return false;
//		}else if(x%11==0){
//		     return false;
//		}else if(x%13==0){
//		     return false;
//		}else if(x%17==0){
//		     return false;
//		}else if(x%y==0) {
//			return false;
//		}else {
//			check(x, y-1);
//		}
//        return true;
//		
		for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                return false;
            }
        }
		return true;
    }
	
	 public static int solution(String numbers) {
	        arr=numbers.split("");
	        Arrays.sort(arr);
	        boolean[]visited=new boolean[arr.length];
	        for(int i=1; i<=arr.length; i++){//자릿수
	        	dfs("",i,0,"",visited);
	        }
//	        System.out.println(set.size());
	        return set.size();
	    }

	public static void dfs(String a,int target ,int dep, String num, boolean[] visited) {
			num+=a;
//			System.out.println("num: "+num);
		if(!num.equals("") && target==dep) {
			if(check(Integer.parseInt(num),Integer.parseInt(num)-1)){
				set.add(Integer.parseInt(num));
				System.out.println("정답: "+Integer.parseInt(num));
				return;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(!visited[i]) {
				visited[i]=true;
				dfs(arr[i], target, dep+1, num, visited);
				visited[i]=false;
			}
		}
		
	}

	public static void main(String[] args) {
		String numbers="011";
		System.out.println(solution(numbers));
	}

}
