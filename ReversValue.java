
public class ReversValue {

	public static void main(String[] args) {
		int array [] = {11,22,33,44,55,66,77,88,99};
		
	/* 1.	for (int i=array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
	*/
		int length = array.length;
		int number = Math.floorDiv(length, 2);
		System.out.println("number = "+ number + " " + "Lenght = " + length);
		int tem;
		for (int i=0; i<number; i ++) {
			tem = array[i];
			array[i] = array[length -i-1];
			array[length -i-1] = tem;
		}
		for (int i : array) {
			System.out.println(i);
		}
	}

}
