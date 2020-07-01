import java.util.*;
import java.io.*;
public class test {

	public static void main(String[] args) throws Exception{

		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	        StringTokenizer st=new StringTokenizer(br.readLine());
	        String a=st.nextToken();
	        String b=st.nextToken();
	        String a1="";
	        String b1="";
	        for(int i=a.length()-1; i>=0; i--){
	            a1+=a.charAt(i)+"";
	            b1+=b.charAt(i)+"";
	        }
	        int q=Integer.parseInt(a1);
	        int w=Integer.parseInt(b1);
	        if(q>w){
	            bw.write(q+"");
	        }else{
	            bw.write(w+"");
	        }
	        bw.flush();
	          
	}
}