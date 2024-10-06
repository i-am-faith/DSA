import java.util.*;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        // Create frequency maps for both arrays
        Map<Integer, Integer> targetFrequency = new HashMap<>();
        Map<Integer, Integer> arrFrequency = new HashMap<>();
        
        // Populate frequency map for target array
        for (int num : target) {
            targetFrequency.put(num, targetFrequency.getOrDefault(num, 0) + 1);
        }
        
        // Populate frequency map for arr array
        for (int num : arr) {
            arrFrequency.put(num, arrFrequency.getOrDefault(num, 0) + 1);
        }
        
        // Compare frequency maps
        return targetFrequency.equals(arrFrequency);
    }
}