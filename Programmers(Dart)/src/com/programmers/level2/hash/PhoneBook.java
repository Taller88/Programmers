package com.programmers.level2.hash;

public class PhoneBook{
	/**
	 * 야비하게 푼 코드 해시도 안씀
	 * @param phone_book
	 * @return
	 */
	    public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        for(int i=0; i<phone_book.length; i++){
	            for(int j=0; j<phone_book.length; j++){
	                if(phone_book[j].contains(phone_book[i]) &&phone_book[i].length()==1 ){
	                    return false;
	                }
	                if(phone_book[j].contains(phone_book[i]) 
	                   && phone_book[i].charAt(1)==phone_book[j].charAt(1)
	                   && i!=j){
	                    return false;
	                }
	            }
	        }
	        return answer;
	    }
	}
