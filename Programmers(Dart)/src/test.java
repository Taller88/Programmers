import java.util.*;
import java.io.*;
public class test {

	public static void main(String[] args) throws Exception{
	    Scanner sc=new Scanner(System.in);
        int sum=0;
        int cnt=0;
        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a<40){
                sum+=40;
            }else{
                sum+=a;
            }
            cnt++;
        }
        System.out.println(sum/cnt);
    }
}