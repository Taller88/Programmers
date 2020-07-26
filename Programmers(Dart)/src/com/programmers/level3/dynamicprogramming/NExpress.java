package com.programmers.level3.dynamicprogramming;

public class NExpress {

	  static int answer=0;
	    public static int solution(int N, int number) {
	        answer = -1;
	        dfs(N,number,1,N,"");
	        return answer;
	    }
	    public static void dfs(int N, int number, int cnt, int value, String tmp){
	        if(cnt>8){
	            return;
	        }
//	        if(cnt==4 && value==number){
//	            System.out.println(value);
//	        }
	        if(value==number){
	            if(answer==-1 || cnt<answer){
	            	System.out.println("tmp: "+tmp);
	                answer=cnt;
	            }
	         return;
	        }
	        
	        dfs(N, number, cnt+1, (value+N),tmp+(String.valueOf(value)+"+"+String.valueOf(N)));
	        dfs(N, number, cnt+1, (value-N),tmp+(String.valueOf(value)+"-"+String.valueOf(N)));
	        dfs(N, number, cnt+1, (value*N),tmp+(String.valueOf(value)+"*"+String.valueOf(N)));
	        dfs(N, number, cnt+1, (value/N),tmp+(String.valueOf(value)+"/"+String.valueOf(N)));
	        boolean check=false;
	        String sCheck=String.valueOf(Math.abs(value));
//	        System.out.println(sCheck);
	        for(int i=0; i<sCheck.length(); i++) {
		        if(Integer.parseInt(sCheck.charAt(i)+"")!=value) {
		        	check=true;
		        	break;
		        }
	        	
	        }
	        if(!check) {
		        dfs(N, number, cnt+1, (value*10+N),tmp+(value*10+N));
	        }
	        
	    }
	    public static void main(String []args) {
	    	System.out.println(solution(5, 12));
	    }
	}