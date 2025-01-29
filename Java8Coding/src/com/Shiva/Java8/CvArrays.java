package com.Shiva.Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CvArrays {

	public static void main(String[] args) {
		 int[] input={2,2,2,4,3,4,1,5,5,5,6,7};
	     int[] input1={100,3,7,7,4,8,3,2};
	        
	        System.out.println("Frequenct Of Array : "+frequencyOfGivenArray(input1));
	        System.out.println("Unique Elements Count : "+uniqueElementCountInGivenArray(input));
	        System.out.println("Least Unique Elements : "+leastUniqueNumberInGivenArray(input1));
	        System.out.println("Most Repeated Elements : "+mostRepeatedInGivenArray(input1));
	      //System.out.println(mostRepeatedInGivenArray1(input1));
	        System.out.println("Duplicate Elements : "+countNumberOfDup(input1));
	        System.out.println("Biggest Element : "+biggestElementOfArray(input));
	        System.out.println("Smallest Element : "+smallestElementOfArray(input));
	        System.out.println("Second Highest Element : "+secondHighestElementOfArray(input));
	}
	
	public static Map<Integer, Long> frequencyOfGivenArray(int[] input) {
		Map<Integer, Long> collect = Arrays.stream(input).boxed()
				.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));
		return collect;

	}

	public static long uniqueElementCountInGivenArray(int[] input1) {
		long uniqueElementsCount = Arrays.stream(input1).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() == 1).count();
		return uniqueElementsCount;
	}
	
	public static Integer leastUniqueNumberInGivenArray(int[] input) {
		Integer leastUniqueNumber = Arrays.stream(input).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).sorted().findFirst().orElse(null);
		return leastUniqueNumber;
	}
	
	private static Integer mostRepeatedInGivenArray(int[] input) {
		Integer mostRepeated = Arrays.stream(input).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).orElse(null);
		return mostRepeated;
	}
	
	/*
	 * private static List<Integer> mostRepeatedInGivenArray1(int[] input) {
	 * Map<Integer, Long> frequencyMap = Arrays.stream(input) .boxed()
	 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	 * 
	 * long maxFrequency = Collections.max(frequencyMap.values());
	 * 
	 * return frequencyMap.entrySet().stream() .filter(entry -> entry.getValue() ==
	 * maxFrequency) .map(Map.Entry::getKey) .collect(Collectors.toList()); }
	 */
	
	private static Long countNumberOfDup(int[] input) {
		long duplicateNumbers = Arrays.stream(input).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()>1).count();
		return duplicateNumbers;
	}
	
	private static Integer biggestElementOfArray(int[] input) {
		Integer biggestElement = Arrays.stream(input).boxed().max(Comparator.comparing(Integer::intValue)).get();
		return biggestElement;
	}
	
	private static Integer smallestElementOfArray(int[] input) {
		Integer smallestElement = Arrays.stream(input).boxed().min(Comparator.comparing(Integer::intValue)).get();
		return smallestElement;
	}
	
	private static Integer secondHighestElementOfArray(int[] input) {
		Integer secondHighest = Arrays.stream(input).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		return secondHighest;
	}
}
