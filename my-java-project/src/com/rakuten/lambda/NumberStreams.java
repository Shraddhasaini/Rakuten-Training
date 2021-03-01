package com.rakuten.lambda;

import java.util.Random;
import java.util.stream.DoubleStream;

public class NumberStreams {
	
	public static void squareRoots(double n) {
		n = Math.sqrt(n);
	}

	public static void main(String[] args) {
		double[] RandDouble = new Random().doubles(50).toArray();
		DoubleStream stream = DoubleStream.of(RandDouble);
		//stream.reduce(Math.sqrt(n)::n);
		
	}
}
