/*
A B C D E
A B C D
A B C
A B
A
*/

public class pattern18
{
    public static void main(String[] args)
    {
		int alpha = 65;
        for (int i =5;i>=1;i--)
        {            
            for (int j = 0; j < i; j++)
            {
                System.out.print((char)(alpha+j) + " ");
            }
            System.out.println();
        }
    }
}