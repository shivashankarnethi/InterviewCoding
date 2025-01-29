package com.Shiva.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BackendInterviewChannel {

	public static void main(String[] args) {
		int[] array={9,6,5,2,1,8,2,6,7,9};
        int[] array1={8,1,4,3,8,8,7,3,6,7};
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> listOfStrings = Arrays.asList("Devara","RRR","ASVR","JanathaGarage","NannakuPrematho","Temper");
        String pinNo="199P5@0115c";
        String string1="Chandu";
        String string2="chanDu";
        
        
        System.out.println("Descending order of given array : "+descendingOrderInGivenArray(array1));
        System.out.println("Sum of String : "+sumOfGivenString(pinNo));
        System.out.println("Reverse of string : "+reverseOfString(string1));
	}
	
	public static List<Integer> descendingOrderInGivenArray(int[] array) {
		List<Integer> desOrderArray = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		return desOrderArray;
	}

	public static Integer sumOfGivenString(String pinNo) {
		int sum = pinNo.chars().filter(Character::isDigit).map(c -> c - '0').sum();
		return sum;
	}

	public static String reverseOfString(String pinNo) {
		String reverse = new StringBuilder(pinNo).reverse().toString();
		return reverse;
	}
}
