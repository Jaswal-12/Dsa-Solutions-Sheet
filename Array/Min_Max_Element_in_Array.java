import java.util.*;

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {

        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            mx = Math.max(mx, arr[i]);
            mn = Math.min(mn, arr[i]);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(mn);
        ans.add(mx);

        return ans;
    }
}
