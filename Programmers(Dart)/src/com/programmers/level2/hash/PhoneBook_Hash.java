package com.programmers.level2.hash;
import java.util.*;
/**
 * Hash를 활용한 코드 But 여러번 for문을 쓴걸로봐서 효율적이진 않음
 * @author user
 *
 */
public class PhoneBook_Hash {
	    public static boolean solution(String[] phone_book) {
	        boolean answer = true;
	        HashMap<String, Integer> map = new HashMap<String, Integer>();
	        for(int inx = 0; inx < phone_book.length; inx++) {
	            for(int jnx = 1; jnx < phone_book[inx].length(); jnx++) {
	                map.put(phone_book[inx].substring(0, jnx), 1);
	                System.out.println("inx: "+inx+" jnx: "+jnx+" phone_book: "+phone_book[inx].substring(0, jnx));
	            }
	            System.out.println();
	        }
	        for(int inx = 0; inx < phone_book.length; inx++) {
	            if(map.containsKey(phone_book[inx])) {
	                answer = false;
	                break;
	            } else {
	                map.put(phone_book[inx], 1);
	            }
	        }
	        return answer;
	    }
	    
	    public static void main(String[]args) {
	    	String[] phone_book= {"119", "97674223", "1195524421"};
	    	solution(phone_book);
	    }
}
