
public class StringClass {

	public static void main(String[] args) {

		String t1 = "racha 123";
		try {
		int getint = Integer.getInteger(t1);
		System.out.println(getint);
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		String s1 = "Hello World", s2 = "Hello word I got qa job" , s3 = "Hello World";
		System.out.println(s1.compareTo(s2));	
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s3));
		System.out.println("s1 "+ s1.length());
		System.out.println("s2 " + s2.length());
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s3.replace("Hello","hi"));
	 int array [] = {10,30,40,400,50,2};
	 
	 int MAX = Integer.MIN_VALUE;
	 int MIN = Integer.MAX_VALUE;
	 for (int i : array) {
		 if (i > MAX) {
			 MAX = i;
		 }
	 }
	 for (int i : array) {
		 if (i < MIN) {
			 MIN = i;
		 }
	 }
	 System.out.println("Maximum No : " + MAX);
	 System.out.println("Minimum No : " + MIN);	
	}
}
