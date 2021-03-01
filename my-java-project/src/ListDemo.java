
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	
	
	public static void main(String[] args) {
//		demoAutoBoxing();
//		demoRawType();
		
//		demoSpecificList();
		
		List<String> strList = new ArrayList<String>();
		myAlgo(strList);
	}

	private static void myAlgo(List<String> strList) {
		strList.add("abc");
		strList.add(0, "first");
		String s = strList.get(1);
		//..........
		System.out.println("The type of list is "+strList.getClass().getName());
		
//		for(int i=0;i<strList.size();i++) {
//			String anElement = strList.get(i);
//			System.out.println(anElement);
//		}
		
//		Iterator<String> it = strList.iterator();
//		
//		System.out.println("The type of it is "+it.getClass().getName());
//		
//		while(it.hasNext()) {
//			String anElement = it.next();
//			System.out.println(anElement);
//		}
		
		for(String anElement : strList) {
			System.out.println(anElement);
		}
		
	}

	private static void demoSpecificList() {
		List<Integer> iList = new ArrayList<Integer>();
		iList.add(123);
//		iList.add("str");
		
		Integer iObj = iList.get(0);
		
	}

	private static void demoRawType() {
		List l = new ArrayList();
		l.add(123);
		l.add(234);
		
		Integer intObj = (Integer) l.get(0);
		System.out.println(intObj);
		String s = (String) l.get(1);
	}

	private static void demoAutoBoxing() {
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add(2);
		l.add(100);
		l.add(1000);
		l.add(10000);
		l.add("abc");
		
		System.out.println(l);
		l.remove("abc");
		l.remove(new Integer(2));
		System.out.println(l);
		
	}

}
