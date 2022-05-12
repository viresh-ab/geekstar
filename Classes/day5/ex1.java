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
        		for(j=1;j<=n;j++)
        		{
                    System.out.println(i+" "+j);
        		}
    		}
	}
}
// to print the pairs of the given integers
// 1 1
// 1 2
// 1 3
// 2 1
// 2 2
// 2 3
// 3 1
// 3 2
// 3 3
