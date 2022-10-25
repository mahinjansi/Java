import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String array[] = {"a","b","c","d","e","f","g","h","i"};
		// To print reverse array string
		for (int i=array.length-1; i>=0; i--) {
			//System.out.println(" To print Reverse : "+array[i]);
		}
		// To print array String
		for (int i=0; i<=array.length; i++) {
			//System.out.println("To print array : " + array[i]);
		}
		// To convert array to list
		List<String> list = (Arrays.asList(array));
		// To print list of array list
		System.out.println(list);
		// To print reverse 
		for(int i=list.size()-1; i>=0; i--) {
			System.out.println( i + " : " + list.get(i) );
		}
		
	}

}
