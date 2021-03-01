package com.rakuten.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ElementUtils {
	public static <T> T betterElement(T s1,T s2,TwoElementPredicate<T> decider) {
		if(decider.isFirstbetterThanSecond(s1, s2)) {
			return s1;
		}else {
			return s2;
		}
	}
	
	
	public static <T> List<T> allMatches(List<T> list,Predicate<T> testCondition){
		List<T> result = new ArrayList<>();
		for(T anEntry : list) {
			if(testCondition.test(anEntry)) {
				result.add(anEntry);
			}
		}
		return result;
	}
	
	
	public static <T,R> List<R> transformedList(List<T> list, Function<T,R> transformer){
		List<R> result = new ArrayList<>();
		for(T anEntry : list) {
			R transformedVaule = transformer.apply(anEntry);
			result.add(transformedVaule);
		}
		return result;
	}
}
