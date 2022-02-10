
public class example1 
{
	public static void main(String[] args) 
	{
		int c=1,n=4;
		 
        for(int i = 0; i < n; i++) 
			{
            for(int k= 1; k <= n-i;k++)
				{
                System.out.print(" ");
                }
 
                for(int j = 0; j <= i; j++) 
				{
                if (j == 0 || i == 0)
                    c = 1;
                else
                    c = c * (i - j + 1) / j;
 
                System.out.print(c);
                }
 
            System.out.println();
        }
	}

}
