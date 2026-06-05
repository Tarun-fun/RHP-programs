package amazing;
import java.util.Scanner;
public class Panagram_checking1 {
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = in.nextLine();
		int f = 0;
		for(int i = 0; i < s.length(); i++)
		{
			char r = s.charAt(i);
			f = f | ( 1 << (r-'a'));
		}
		if(f == ((1 << 26)- 1))
		{
			System.out.println("Yes");
		}
		
		else
		{
			System.out.println("No");
		}
		in.close();
	}

}
