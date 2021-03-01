public class HelloWorld {
	
	public static void increment(int someInt) {		
		++someInt;
	}
	
	public static void increment(int[] someArr) {		
		someArr[0]++;
	}
	
	public static void main(String[] args) {
		int aPrimitive = 10;
		increment(aPrimitive);
		System.out.println(aPrimitive);		
		System.out.println("===========");
		int[] aRef = new int[25];
		aRef[0] = 10;
		increment(aRef);
		System.out.println(aRef[0]);
		
	}
}
