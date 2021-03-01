package com.rakuten.lambda;

import java.util.Arrays;

public class MethodRef {
	
	public int eChecker(String s1, String s2) {
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(!s1.contains("e") && s2.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}
	

	public static void main(String[] args) {
		
		Arrays.sort(SortDemo.strings, (s1,s2)-> s1.length() - s2.length());
		System.out.println(Arrays.asList(SortDemo.strings));
		Arrays.sort(SortDemo.strings, (s1,s2)-> s2.length() - s1.length());
		System.out.println(Arrays.asList(SortDemo.strings));
		Arrays.sort(SortDemo.strings, (s1,s2)-> s1.substring(0,1).compareTo(s2.substring(0,1)));
		System.out.println(Arrays.asList(SortDemo.strings));
		MethodRef obj  = new MethodRef();
		Arrays.sort(SortDemo.strings, obj::eChecker);
		//if static --> MethodRef::eChecker
		System.out.println(Arrays.asList(SortDemo.strings));
	}

}