
public class PalindromeExample {

	public static void main(String[] args) {
		int r, sum=0, temp, count = 0;
		int n = 3145431;
		temp=n;
		while(n>0) {
			r = n%10;
			System.out.println("r : " + count + " : " +r);
			count++;	
			sum = (sum*10)+r;
			System.out.println("Sum : " + sum);
			n = n/10;
			System.out.println("n: " + n);
			}
		if(temp == sum) {
			System.out.println("No. palindrome");
		}
		else
			System.out.println("Not palindorom");
	}
	
}
/*
 *
WebDriver driver = new 
JavaScript
 
 
 *T
 * */
