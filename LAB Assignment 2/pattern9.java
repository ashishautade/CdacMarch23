/*
    A
   A B
  A B C
 A B C D 
A B C D E
*/

class pattern9
{
	public static void main(String []args)
	{
		for(int i=1;i<=5;i++)
		{
			 for(int j=5;j>=i;j--)
		  {
			  System.out.print(" ");
		  }
		  for(int k=65;k<=65+i-1;k++)
		  {
			   System.out.print((char)+k+" ");
		  }
		  System.out.println();
		}
	}
}