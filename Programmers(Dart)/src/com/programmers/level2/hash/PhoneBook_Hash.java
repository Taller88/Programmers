package com.programmers.level2.hash;
import java.util.*;
import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Map<String,String> map = new HashMap<>();//map은 순서가없는데 LinkedHashMap은 순서있음
        
        for(String phone:phone_book){
            map.put(phone,"prefix");
        }
        System.out.println(map);
        
        for(String phone:phone_book){
            for(int i=0; i<phone.length();i++){
                if(map.containsKey(phone.substring(0,i))) return false;
            }
        }
        
        
        return answer;
    }
}
