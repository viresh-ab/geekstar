// a 
// a b 
// a b c 
// a b c d 

import java.util.*;
 
class day4 
{
	public static void main(String args[])
	{
		int i,j,n;
 		Scanner sc = new Scanner(System.in);
 		n=sc.nextInt();
        int c = 96;
    		for(i=1;i<=n;i++)
    		{
        		for(j=1;j<=i;j++)
        		{
            			System.out.print((char)(c+j)+" ");
        		}
 
        		System.out.println();
    		}
	}
}
