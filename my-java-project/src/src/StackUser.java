package src;

public class StackUser {
	
	public void fill(Stack s) {
		for(int i=0;i<10;i++) {//i in primitive
			s.push(i);//push takes object --> would have refued to compile in older version of java (type mismatch)
			//autoboxing and unboxing in java 5
			//concept of wrapper class
			System.out.println("Pushed ---> " +i);
		}
		
	}

	public void empty(Stack s) {
		
		
	}
	
}
