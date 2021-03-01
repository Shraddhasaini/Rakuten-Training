package src;

public class FixedArrayStack<E> implements Stack<E> {
	private Object[] contents;
	private int top = -1;
	
	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
		
	}

	@Override
	public void push(E anElement) {
		  try {
	            contents[++top] = anElement;
	        }catch (ArrayIndexOutOfBoundsException e) {
	            top--;
	            throw new StackFullException("Stack capacity = "+contents.length+", already full",e);
	        }
		}
		

	@Override
	public E pop() {
		return (E) contents[top--];
	}
	
	
}
