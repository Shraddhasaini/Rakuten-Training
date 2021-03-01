package com.rakuten.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {
	int instanceVar = 10;
	
	
	public static List<String> allMatches(List<String> list, Predicate<String> testCondition){
		List<String> result = new ArrayList<String>();
		for(String anEntry:list) {
			result.add(anEntry);
		}
		return result;
	}
	
	
	//whatever arg
	public static <T> T betterEntry(T ele1,T ele2,TwoElementPredicate<T> decider) {
		if(decider.isFirstbetterThanSecond(ele1, ele2)) {
			return ele1;
		} else {
			return ele2;
		}
	}
	
	public void lambdaScopeAndLocalDemo() {
		
		// no // String s1 = "abc";
		 int i = 42;
		
		Arrays.sort(SortDemo.strings,(s1,s2)->{
			//Lexical scoping
			this.instanceVar++; //obj of LambdaDemo class
			// No // String s1;
			System.out.println(i);
			return s1.substring(0,1).compareTo(s2.substring(0,1));
		});
		//i++;
		System.out.println(Arrays.asList(SortDemo.strings));
	}

	public static List<String> transformedList(List<String> list, Function<String,String> transformer){
		List<String> result = new ArrayList<String>();
		for(String anEntry:list) {
			String transformedValue = transformer.apply(anEntry);
			result.add(transformedValue);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		/*
		 * Arrays.sort(SortDemo.strings, (s1,s2)-> s1.length() - s2.length());
		 * System.out.println(Arrays.asList(SortDemo.strings));
		 * Arrays.sort(SortDemo.strings, (s1,s2)-> s2.length() - s1.length());
		 * System.out.println(Arrays.asList(SortDemo.strings));
		 * Arrays.sort(SortDemo.strings, (s1,s2)->
		 * s1.substring(0,1).compareTo(s2.substring(0,1)));
		 * System.out.println(Arrays.asList(SortDemo.strings));
		 *  Arrays.sort(SortDemo.strings, (s1,s2)-> { if(s1.contains("e") &&
		 * !s2.contains("e")) { return -1; }else if(!s1.contains("e") &&
		 * s2.contains("e")) { return 1; }else { return 0; } });
		 * System.out.println(Arrays.asList(SortDemo.strings));
		 * 
		 * 
		 * String longer = betterEntry("Hi", "hello", (s1,s2)-> s2.length() <
		 * s1.length()); System.out.println(longer);
		 */
		
		List<String> words = Arrays.asList(SortDemo.strings);
		
//		List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
//		System.out.println(shortWords);
//		List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
//		System.out.println(wordsWithB);
//		List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
//		System.out.println(evenLengthWords);
//		
//		List<String> shortWords2 = ElementUtils.allMatches(words, s -> s.length() < 4);
//		System.out.println(shortWords2);
		
		List<String> excitingWords = LambdaDemo.transformedList(words, s -> s + "!");
		System.out.println(excitingWords);
		List<String> eyeWords = LambdaDemo.transformedList(words, s -> s.replace("i", "eye"));
		System.out.println(eyeWords);
		List<String> upperCaseWords = LambdaDemo.transformedList(words, String::toUpperCase);
		System.out.println(upperCaseWords);
		
		List<String> upperCaseWords2 = ElementUtils.transformedList(words, String::toUpperCase);
		System.out.println(upperCaseWords2);
		
		List<Integer> lengths = ElementUtils.transformedList(words, s -> s.length());

		

		
	}
	

}