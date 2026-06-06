package amazing;
import java.util.Scanner;
public class DP_columnwise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arr = new int[a][b];
        int[][] arr1 = new int[a][b];


        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        
        for(int j = 0; j < b; j++)
        {
        	for(int i = 0; i < a; i++)
        	{
        		if(j == 0)
        		{
        			arr1[i][j] = arr[i][j];
        		}
        		
        		else
        		{
        			int max = 0;
        			for(int k = 0; k < a; k++)
        			{
        				if(i == k)
        				{
        					continue;
        				}
        				else
        				{
        					if(max < arr1[k][j-1])
            				{
            					max = arr1[k][j-1];
            				}        					
        				}
        				
        			}
        			arr1[i][j] = max + arr[i][j];
        		}
        	}
        }

       
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        
        int h = b - 1;
        int maxi = 0;

        for(int l = 0; l < b; l++)
        {
            if(maxi < arr1[l][h])
            {
                maxi = arr1[l][h];
            }
        }

        System.out.println(maxi);

        sc.close();

	}

}
