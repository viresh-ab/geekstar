import java.io.*;
import java.util.*;

class AreaofRectangle {
	public static void main (String[] args) {
	 Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        System.out.println("length : "+length);
        int width = scan.nextInt();
        System.out.println("width : "+width);
        int a = length*width;
        System.out.println("Area of rectangle = length * width : "+length+"*"+width+"="+a);
	}
}
