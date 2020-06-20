import java.util.*;

public class test {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue<>(Collections.reverseOrder());
		
		q.add(1);
		q.add(3);
		q.add(2);
		
		System.out.println(q.poll());
		
			System.out.println(2.1%2!=0);
			String tmp="123";
			int [] arr=new int[tmp.length()];
			for(int i=0; i<tmp.length(); i++) {
				arr[i]=tmp.charAt(i)-'0';
				System.out.println(arr[i]);
			}
			String [] tem= {"1", "2"};
			char t='9';
			int t1=(int)(t)-'0';
			System.out.println(t1);

			ArrayList<Integer> a=new ArrayList<>();
			
			String re="push 1123";
			String[] qq= re.split(" ");
			System.out.println(qq[0]);
			System.out.println(Integer.parseInt(qq[1])+1);
			
	}

}
