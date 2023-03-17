/* 
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
*/

import java.util.Scanner;
class pattern8{
	public static void main(String[] args)
	{ 
	  System.out.println("enter the number of lines");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int x=n;
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=n-i;j>=1;j--)
		  {
			  System.out.print(" ");
		  }
		   for(int k=x;k<=n;k++)
		   {
			  System.out.print(k+" ");
		   }
		  System.out.println();
		  x--;
	  }
	}
}
