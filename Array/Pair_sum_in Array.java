import java.util.HashSet;

class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Create a HashSet to store elements
        HashSet<Integer> hs = new HashSet<>();
        
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            int x = target - arr[i];
            if (hs.contains(x)) {
                return true; // Pair found
            } else {
                hs.add(arr[i]); // Add current element to set
            }
        }
        
        return false; // No pair found
    }
}
