package com.programmers.kakako;
import java.util.*;
public class StackSol {
	public static boolean check(String p) {
		 Stack<Character> stk=new Stack<>();
		 for(int i=0; i<p.length(); i++) {
			 if(p.charAt(i)=='(') {
				 stk.push('(');
			 }else if(!stk.isEmpty() && stk.peek()=='(' &&p.charAt(i)==')') {
				 stk.pop();
			 }
		 }
		return stk.isEmpty();
	}
	 public static String solution(String p) {
		 if(check(p)) return p;
		 //일단 괄호가 안맞는 애들
		 String[]arr=p.split("");
		 Stack<String> stk=new Stack<>();
		 for(int i=0; i<arr.length; i++) {
//			 System.out.println(i+": "+arr[i]+" stk.isEmpty: "+stk.isEmpty());
			 if(stk.isEmpty() && arr[i].equals("(")) {
				 stk.push("(");
			 }else if(stk.isEmpty() && arr[i].equals(")") ) {
//				 System.out.println("!!: "+i+": "+arr[i]);
				 arr[i]="(";
				 stk.push(")");
			 }else if(!stk.isEmpty() && stk.peek().equals("(") &&arr[i].equals(")")) {
				 stk.pop();
//				 System.out.println("!!!: "+i+": "+stk.pop());
			 }else if(!stk.isEmpty() && stk.peek().equals(")") &&arr[i].equals("(")) {
//				 System.out.println("!!!!: "+i+": "+stk.peek());
				 arr[i]=")";
				 stk.pop();
			 }else if(!stk.isEmpty() && stk.peek().equals(")") &&arr[i].equals(")")) {
//				 System.out.println("!!!!: "+i+": "+stk.peek());
				 arr[i]="(";
				 stk.pop();
			 }
		
		 }
		 String answer="";
		 for(int i=0; i<arr.length; i++) {
			 answer+=arr[i];
		 }
		 System.out.println("바꾼애");
		 System.out.println("기존: "+p +" 바꾼: "+answer);
		 System.out.println(check(answer));
		 return answer;
	 }
	public static void main(String[] args) {
		System.out.println(solution("()))((()"));
		System.out.println("()(())()");
	}

}
