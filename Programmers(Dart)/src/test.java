import java.util.*;
import java.io.*;
public class test {

	public static void main(String[] args) throws Exception{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	        String abc="abcdefghijklmnopqrstuvwxyz";
         String arr[]=abc.split("");
         String tmp=br.readLine();
         String tArr[]=tmp.split("");
          for(int i=0; i<arr.length; i++){
                 bw.write(tmp.indexOf(arr[i])+" ");
            
          
         }
	        bw.flush();
	        
	        String a="";
	        a+="asdasd";
	        System.out.println(a);
	}
}