package amazing;
import java.util.Scanner;
public class DP_rowise {

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

        
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                if(i == 0)
                {
                    arr1[i][j] = arr[i][j];
                }
                else
                {
                    int max = 0;

                    for(int k = 0; k < b; k++)
                    {
                        if(k == j)
                        {
                            continue;
                        }
                        else
                        {
                            if(max < arr1[i - 1][k])
                            {
                                max = arr1[i - 1][k];
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

        
        int h = a - 1;
        int maxi = 0;

        for(int l = 0; l < b; l++)
        {
            if(maxi < arr1[h][l])
            {
                maxi = arr1[h][l];
            }
        }

        System.out.println(maxi);

        sc.close();

	}

}
