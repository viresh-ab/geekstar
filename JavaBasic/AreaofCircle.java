import java.io.*;
import java.util.*;

class AreaofCircle {
	public static void main (String[] args) {
	 Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();
        System.out.println("radius : "+radius);
        int pi=3.142;
        int a = pi*(radius*radius);
        System.out.println("Area of circle = pi*r^2:"+a);
	}
}
