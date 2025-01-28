package com.HclDrive;

public class abcdMultiple {

	public static void main(String[] args) {
    String input	= "abcd";//efgh
    int add = 4;
    StringBuilder output = new StringBuilder();
    
    for (int i = 0;i<input.length();i++) {
    	output.append((char) (input.charAt(i)+add));
    }
    System.out.println("Output : "+output.toString());

	}

}
