//Garbage collection
public class HeapStack {
	public static void method1() {
		DOWFinder ref2 = new DOWFinder();
	}
	
	public static void main(String[] args) {
		int i =10;
		DOWFinder ref1 = new DOWFinder();
		method1();
		//something -- stack unvinding
		System.out.println("Done");
	}
}
