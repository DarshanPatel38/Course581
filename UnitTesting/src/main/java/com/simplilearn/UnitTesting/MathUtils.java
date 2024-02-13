package com.simplilearn.UnitTesting;

public class MathUtils {
	
	int add(int a, int b) {
		return a+b;
	}
	
	int subtract(int a, int b) {
		return a-b;
	}
	
	int multiply(int a, int b) {
		return a*b;
	}
	
	double divide(int a, int b) {
		double ans = b == 0 ? -1.0 : (double)a/(double)b;
		return ans;
	}

}
