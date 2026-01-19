class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int[] leftmx = new int[n];
        int[] rightmx = new int[n];

        // Fill left max array
        leftmx[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftmx[i] = Math.max(leftmx[i - 1], arr[i]);
        }

        // Fill right max array
        rightmx[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmx[i] = Math.max(rightmx[i + 1], arr[i]);
        }

        // Calculate trapped water
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.min(leftmx[i], rightmx[i]) - arr[i];
        }

        return sum;
    }
}
