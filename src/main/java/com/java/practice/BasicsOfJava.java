package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class BasicsOfJava {
	@Test
	void findLargestAndSmall() {
		int a[] = { 2, 8, 7, 3, 1, 9 };
		int max = a[0];// 2
		int min = a[0];// 2

		for (int i = 0; i < a.length; i++) {

			if (max > a[i]) {
				a[i] = max;
			} else if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println(max);

	}
}
