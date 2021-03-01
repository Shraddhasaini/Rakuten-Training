package com.rakuten.lambda;
public class SortDemo {
	
	public static String[] strings = {"this","is","a","bunch","of","strange","words","like","xylophone","and","zoo"};
	

	public static void main(String[] args) {
		simpleStringArraySort();
		

	}


	private static void simpleStringArraySort() {
		System.out.println("before sort\n"+strings);
		
		System.out.println("after sort\n"+strings);
		
	}

}
