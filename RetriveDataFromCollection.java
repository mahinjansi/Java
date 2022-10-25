import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RetriveDataFromCollection {

	public static void main(String[] args) {
		/*
		HashMap <Integer, String> hashmaplist = new HashMap <Integer, String>();
		hashmaplist.put(1, "A");
		hashmaplist.put(2, "B");
		hashmaplist.put(3, "C");
		hashmaplist.put(4, "D");
		hashmaplist.put(5, "D");
		hashmaplist.put(6, "E");*/
		
		String s = "abcdefghigklmno";
		
		ArrayList <String> list = new ArrayList<>(Arrays.asList(s));
		/*
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());			
		}*/
		
		// #1 method to iterate through Iterator and while loop
		/*
		Iterator hmIt = hashmaplist.entrySet().iterator();
		
		while (hmIt.hasNext()) {
			System.out.println(hmIt.next());
		}*/
		
		//	// #2 method to iterate through enhanced loop 
		/*
		for (Map.Entry<Integer, String> pair : hashmaplist.entrySet()) {
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}*/
		
		}
	}