package day1_assignment;
import java.util.Arrays;
class arrQ3{
	public static int[] copyOf(int[] array) {
		return Arrays.copyOf(array, array.length);
	}
	
}
public class Q3 {

	public static void main(String[] args) {

		int arr[]= {4,5,6,7,67};
		
		int copyOfArr[]=arrQ3.copyOf(arr);
	}
}
