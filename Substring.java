package amazing;
import java.util.Scanner;
public class Substring {
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		int R = a.length();
		int C = b.length();
		int max = 0;
		
		int[][] dp = new int[R+1][C+1];
		
		for(int i = 0; i <= R; i++)
		{
			for(int j = 0; j <= C; j++)
			{
				if(i == 0 || j == 0)
				{
					dp[i][j] = 0;
				}
			}
		}
		
		for(int i = 1; i <= R; i++)
		{
			for(int j = 1; j <= C; j++)
			{
				if(a.charAt(i-1) == b.charAt(j-1))
				{
					dp[i][j] = dp[i-1][j-1] + 1;
					if(dp[i][j] > max)
					{
						max = dp[i][j];
					}
				}
			}
		}
		
		for(int i = 1; i <= R; i++)
		{
			for(int j = 1; j <= C; j++)
			{
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(max);
		in.close();
	}
}
