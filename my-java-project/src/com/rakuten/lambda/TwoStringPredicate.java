package com.rakuten.lambda;

//target for lambda expression


@FunctionalInterface
public interface TwoStringPredicate {
	boolean isFirstbetterThanSecond(String first, String Second);
}
