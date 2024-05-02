package pr1;
import java.util.Arrays;
public class arrayeg {
	public static void main(String[] args) {
		
	int[] numbers= {5,6,7,8,9};
	System.out.println("original array:"+ Arrays.toString(numbers));
	
	Arrays.sort(numbers);
	System.out.println("Sorted array:"+ Arrays.toString(numbers));
	
	int index=Arrays.binarySearch(numbers,5);
	System.out.println("index of 5:"+index);
	
	int[] filledArray=new int [5];
	Arrays.fill(filledArray,10);
	System.out.println("filled array:"+Arrays.toString(filledArray));
	
	int[] copiedArray=Arrays.copyOf(numbers,numbers.length);
	System.out.println("copied array:"+Arrays.toString (copiedArray));
	
	boolean areEqual=Arrays.equals(numbers, copiedArray);
	System.out.println("are number and copiedArray equal?"+areEqual);
	
	String arrayString = Arrays.toString(numbers);
	System.out.println("Array as a String"+arrayString);
	
	int max=Arrays.stream(numbers).max().getAsInt();
	int min=Arrays.stream(numbers).min().getAsInt();
	System.out.println("max element:"+max);
	System.out.println("min element:"+min);
	
	}
}
	
	
	
