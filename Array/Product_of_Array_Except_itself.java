class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n=nums.length;
        int ans[]=new int[n];
        int idx=0;


        for(int i=0;i<n;i++){
            int p=1;
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }else{
                p=p*nums[j];
                }
            }
            ans[idx]=p;
            idx++;
        }

        return ans;

    }
}


// Approach -2 using  suffix  and prefix
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];

        // Prefix product
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Suffix product
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // Result
        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
}
