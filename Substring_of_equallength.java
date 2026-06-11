package amazing;
import java.util.Scanner;
import java.util.LinkedHashMap;
public class Substring_of_equallength {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int max = 0;
		int val = 0;
		LinkedHashMap<Integer,Integer> wow = new LinkedHashMap<>();
		for(int i = 0; i < s.length(); i++)
		{
			
			if(wow.isEmpty())
			{
				wow.put(0, -1);
			}
			
			if(s.charAt(i) == '0') {
				val -= 1;
			}
			
			else {
				val += 1;
			}
			
			if(wow.containsKey(val))
			{
				int a = wow.get(val);
				int d = Math.abs(a-i);
				max = Math.max(max, d);
			}
		
			else
			{
				wow.put(val,i);
			}
		}
		System.out.println(max);
		in.close();
	}
}
