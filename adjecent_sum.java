package amazing;
import java.util.Scanner;
public class adjecent_sum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int[][] arr = new int[a][b];
		int d[][] = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
		for(int i = 0; i < a; i++)
		{
			for(int j = 0; j < b; j++)
			{
				arr[i][j] = in.nextInt();
			}
		}
		
		for(int i = 0; i < a; i++)
		{
			for(int j = 0; j < b; j++)
			{
				int s = 0;
				for(int k = 0; k < 8; k++)
				{
					int ar = i + d[k][0];
					int ac = j + d[k][1];
					if((ar >= 0 && ar < a) && (ac >= 0 && ac < b))
					{
						s += arr[ar][ac];
					}
				}
				System.out.print(s + " ");
			}
			System.out.println();
		}
		in.close();
	}

}
