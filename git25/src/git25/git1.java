package practice;
import java.util.*;
public class git1 {
	public static float si(float p,float r,float t) {
		return (p*r*t)/100;
	}
	
	public static float discount(float p) {
		 return p - (p * 0.1f);
	}
	public static int arrs(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
}
