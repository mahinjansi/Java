import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveArrayList {

	public static void main(String[] args) {
		ArrayList <Integer> number = new ArrayList <Integer> (Arrays.asList(11,22,33,44,55,66,77,88,99,11,99,22,44,35,40,50));
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet <Integer>(number);
		ArrayList <Integer> numberNoDuplicat = new ArrayList <Integer> (linkedHashSet);
		System.out.println("Array List " + number + " " + "numberNoDuplicat "+ numberNoDuplicat );
		System.out.println("linkedHashSet List " + linkedHashSet);
		
		
/*	ArrayList <Integer> number = new ArrayList <Integer> (Arrays.asList(22,33,44,55,66,77,88,99,11,99,22,44,35,40,50));
	List <Integer> uniqueList = number.stream().distinct().collect(Collectors.toList());
	System.out.println(uniqueList);	*/	
	}

}
