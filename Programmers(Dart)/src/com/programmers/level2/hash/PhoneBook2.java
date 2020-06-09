package com.programmers.level2.hash;
import java.util.*;
public class PhoneBook2{
	/**
	 * Arrays.sort를 활용하여 배열을 정렬+startsWith라는 메소드를 활용
	 * @param phone_book
	 * @return
	 */
	    public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        Arrays.sort(phone_book);
	        for(int i=0; i<phone_book.length; i++) {
	        	if(phone_book[i+1].startsWith(phone_book[i])) {
	        		return false;
	        	}
	        }
	        return answer;
	    }
	}
