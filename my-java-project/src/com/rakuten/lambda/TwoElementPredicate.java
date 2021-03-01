package com.rakuten.lambda;
//Important concept
//generics
@FunctionalInterface
public interface TwoElementPredicate<E> {
	public boolean isFirstbetterThanSecond(E first, E Second);
	
	//default implementation 
/*	public default void aDefaultMetod()
	{
		System.out.println("default!");
	}*/
}
