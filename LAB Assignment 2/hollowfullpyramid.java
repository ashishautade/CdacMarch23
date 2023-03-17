/*
     *
    * *
   *   *
  *     *
 *       *
*         *
***********
*/
import java.util.*;
public class hollowfullpyramid
 {

	public static void main(String[] args) 
	{
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1||((i==n)&&(j%2!=0)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=1;j<i;j++)
			{
				if(j==i-1||((i==n)&&(j%2!=0)))
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
        
    } 
}