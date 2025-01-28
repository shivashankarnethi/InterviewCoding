package com.HclDrive;

/*
 * public class permutations { public static void main(String[] args) { String
 * input = "abcd";
 * 
 * // Generate rotated strings for (int i = 0; i < input.length(); i++) { String
 * rotated = input.substring(i) + input.substring(0, i);
 * System.out.println(rotated); } } }
 */

import java.util.HashSet;
import java.util.Set;

public class permutations {
    public static void main(String[] args) {
        String input = "abcd";
        Set<String> result = new HashSet<>(); // To avoid duplicates

        // Generate all permutations
        permute(input, "", result);

        // Print all permutations
        for (String permutation : result) {
            System.out.println(permutation);
        }
    }

    public static void permute(String str, String prefix, Set<String> result) {
        if (str.isEmpty()) {
            result.add(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                // Choose one character to include in the prefix
                char ch = str.charAt(i);
                // Remaining substring after removing the chosen character
                String remaining = str.substring(0, i) + str.substring(i + 1);
                // Recurse with the new prefix and remaining characters
                permute(remaining, prefix + ch, result);
            }
        }
    }
}

