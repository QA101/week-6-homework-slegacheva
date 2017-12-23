// Write a function that checks whether an INTEGER ARRAY is a palindrome or not.
import java.util.Arrays;

public class IntArrPal {

	public static void main(String[] args) {
int arr[]= {1,2,3,4,3,2,1};		
intPal(arr);

	}
	public static void intPal(int[] intArr) {
	int[] revArr=new int[intArr.length];
	int i=0;
	int j=0;
		for (i=intArr.length-1;i>=0;i--) {
			revArr[j]=intArr[i];
			System.out.print(revArr[j]);
			j++;
		}
		if(Arrays.equals(revArr, intArr)) 
				{
			System.out.println(" is Palindrome");
				}else {
					System.out.println(" is not Palindrome");
				}
			
		
			
		
	}
}

