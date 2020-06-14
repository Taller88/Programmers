package com.programmers.level2.greedy;

public class JoyStick {

public int solution(String name) {	
    int answer = 0;
    String tmp="";
    for(int i=0; i<name.length(); i++){
        tmp+='A';
    }
    System.out.println("A-Z: "+ ('Z'-'A'));
    int cnt=0;
     if(name.charAt(0)-'A'>13){
            System.out.println("뒤: "+ ('Z'-name.charAt(0)) );
            cnt+=('Z'-name.charAt(0)+1);
        }else{
            System.out.println("앞: "+ (name.charAt(0)-'A'));
            cnt+=(name.charAt(0)-'A');
        }
    if(name.charAt(1)=='A'){//왼쪽으로 이동하는 경우
        System.out.println("왼쪽으로 이동중");
        for(int i=name.length()-1; i>0; i--){
        cnt++;
        if(name.charAt(i)=='A'){
            continue;
        }
        if(name.charAt(i)-'A'>13){
            System.out.println("뒤: "+ ('Z'-name.charAt(i)) );
            cnt+=('Z'-name.charAt(i)+1);
        }else{
            System.out.println("앞: "+ (name.charAt(i)-'A'));
            cnt+=(name.charAt(i)-'A');
        }
    }//if    
        
    }else{//오른쪽으로 이동하는 경우
        System.out.println("오른쪽으로 이동중");
        
    for(int i=1; i<name.length(); i++){
        cnt++;
        if(name.charAt(i)=='A'){
            continue;
        }
        if(name.charAt(i)-'A'>13){
            System.out.println("뒤: "+ ('Z'-name.charAt(i)) );
            cnt+=('Z'-name.charAt(i)+1);
        }else{
            System.out.println("앞: "+ (name.charAt(i)-'A'));
            cnt+=(name.charAt(i)-'A');
        }
    }
        
    }
    System.out.println(tmp);
    System.out.println(cnt);
    
    return cnt;
}
}
