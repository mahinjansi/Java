
public class WrapperClassDataConversion {

	public static void main(String[] args) {
		String str = "1234";
		int i = Integer.parseInt(str);
		
		int a = i * 10;
		double d = Double.parseDouble(str);
		boolean bl = Boolean.parseBoolean(str);
		
		System.out.println(bl);
		String s = String.valueOf(i);
		System.out.println(s + d);
		
	}

}
