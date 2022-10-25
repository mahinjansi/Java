
public class PracticeJava {

	public static void main(String[] args) {
		
		// reverse string
		//converting string from string buffer class
		String st = "abcd", rev =  " ";
		StringBuffer  obj = new StringBuffer(st);
		 System.out.println("1 : " + obj.reverse());
		 // reverse string using charatlast()
		 int len = st.length();
		 for (int i = len-1; i>=0; i--) {
			rev = rev + st.charAt(i);
		 }
		 System.out.println("2 : " + rev.trim());
		 // revere string by converting to array
		 char array[] = st.toCharArray();
		 for (int i = array.length-1; i>=0; i--) {
			 rev = rev+array[i];
		 }
		 System.out.println("3 : " + rev.trim());
	}

}
