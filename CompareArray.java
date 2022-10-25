
public class CompareArray {

	public static void main(String[] args) {
		int array1 [] = {1,2,30,45};
		int array2 [] = {100,2,40,35,30};
		
		boolean result = array1.equals(array2);
		System.out.println(result);
		String name = "ABCD";
		int len = name.length();
		String revers = "";
		for (int i=len-1; i>=0; i--) {
			revers = revers + name.charAt(i);
		}
		System.out.println(revers);
		System.out.println("******************");
		
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.reverse());
		System.out.println("******************");
		int number = 12345;
		int rev = 0;
		while (number !=0) {
			rev = rev*10 + number %10;
			System.out.println("Reverse : "+ rev);
			number = number/10;
			System.out.println("Number : "+ number);
		}
		//System.out.println(rev);
				

	}

}
