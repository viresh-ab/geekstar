import java.util.*;
 
class day4 
{
	public static void main(String args[])
	{
		int i,j,n;
 		Scanner sc = new Scanner(System.in);
 		n=sc.nextInt();
    		for(i=1;i<=n;i++)
    		{
        		for(j=i;j>=1;j--)
        		{
            			System.out.print(j+" ");
        		}
 
        		System.out.println();
    		}
	}
}
