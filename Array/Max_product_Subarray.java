class Solution {
    public int maxProduct(int[] nums) {
        

        int n=nums.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int p=1;
            for(int j=i;j<n;j++){
                p=p*nums[j];
                mx=Math.max(p,mx);
            }
        }

        return mx;

    }
}
