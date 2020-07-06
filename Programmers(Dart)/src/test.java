import java.util.*;
import java.io.*;
public class test {

	
	public static void main(String[] args) throws Exception{
		ArrayList<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		Stack<Integer> stk=new Stack<>();
		Collections.sort(list);
			list.add(1);
			ArrayList<Integer> list2=(ArrayList<Integer>) list.clone();
			
			System.out.println(list2.get(0));
	}
}