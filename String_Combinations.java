package amazing;
import java.util.Scanner;
public class String_Combinations {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = in.nextLine();
		int l = s.length();
		for(int i = 1; i < (1 << l); i++)
		{
			String h = "";
			for(int j = 0; j < l; j++)
			{
				if((i & (1 << j)) > 0)
				{
					h += s.charAt(j);
				}
					
			}
			System.out.println(h);
		}
		in.close();
	}
}
