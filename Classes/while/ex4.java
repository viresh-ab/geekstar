// reverse of array without using function
import java.util.Scanner;
public class Example{
  public static void main(String args[]){
  Scanner scanner = new Scanner(System.in);
	int n, i=0, j=0, temp;
	int a[] = new int[100];
	n = scanner.nextInt();
	for(i=0; i<n; i++){
	    a[i] = scanner.nextInt();
	}
  j = i-1;     
	i = 0;         
	scanner.close();
	while(i<j){
  	 temp = a[i];
	   a[i] = a[j];
	   a[j] = temp;
	   i++;
	   j--;
	}
	for(i=0; i<n; i++){
	   System.out.print(a[i]+ "  ");
	}       
}
}
