package com.programmers.level2.kakao;

import java.util.ArrayList;

public class WithPicture {
		static String[] arr={"A", "C", "F", "J", "M", "N", "R", "T"};
		static ArrayList<String> list=new ArrayList<>();
		static int answer=0;
	 public static int solution(int n, String[] data) {
	        boolean[] visited=new boolean[8];
	        dfs("",0,visited,n, data);
	        System.out.println(answer);
	        return answer;
	}
	public static boolean check(int n, String[] data, String s) {
		boolean check=true;
		for(int i=0; i<data.length; i++) {
			//R~T>2
			
			int num=Integer.parseInt(data[i].substring(4));
			String[] ran=data[i].substring(0,3).split("~");
			String oper=String.valueOf(data[i].charAt(3));
			System.out.println("ran:"+ran[0]+" "+ran[1]+" "+oper+" "+num+" s:"+s);
//			if(i==1 && (s.indexOf(ran[0])-s.indexOf(ran[1])==2 || s.indexOf(ran[1])-s.indexOf(ran[0])==2)) {
//
//				System.out.println("?: "+s);
//				
//			}
			//System.out.println(s.indexOf(ran[0])-s.indexOf(ran[1])>num+1||s.indexOf(ran[1])-s.indexOf(ran[0])>num+1);
			if(oper.equals(">")) {
				if(!(Math.abs(s.indexOf(ran[0])-s.indexOf(ran[1]))>num+1)) {
					check=false;
					break;
				}
			}else if(oper.equals("<")) {
				if(!(Math.abs(s.indexOf(ran[0])-s.indexOf(ran[1]))<num+1) ){
					check=false;
					break;
				}
			}else if(oper.equals("=")) {
				if(!(Math.abs(s.indexOf(ran[0])-s.indexOf(ran[1]))==num+1)) {
					check=false;
					break;
				}
			}
			
		}
		System.out.println(check);
		return check;
	}
	public static void dfs(String s, int cnt,boolean[] visited, int n, String[] data) {
		if(cnt==8) {
			if(check(n, data, s)) {
				answer++;
				return;
			}
		}
		
		for(int i=0; i<8; i++) {
			if(!visited[i]) {
				visited[i]=true;
				dfs(s+arr[i],cnt+1, visited,n,data);
				visited[i]=false;
				}
		}
	}
	public static void main(String[] args) {
		int n=2;
		//String[] data= {"N~F=0", "R~T>2"};
		String[] data= {"M~C<2", "C~M>1"};
		solution(n, data);
		
	}

}
