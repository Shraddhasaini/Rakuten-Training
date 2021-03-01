package src;

//google solid design principle

public class StackApp {

	public static void main(String[] args) {
		Stack<Integer> st = new FixedArrayStack<>(10);
		
		// Stack st = new DynaStack();
		
		StackUser u = new StackUser();
		
		u.fill(st);
		
	}
}
