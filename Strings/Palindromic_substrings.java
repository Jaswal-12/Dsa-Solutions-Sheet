// leetcode 647

class Solution {
    public int countSubstrings(String s) {
        
      int count=0;

      for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
        String x=s.substring(i,j+1);
        if(isAnagram(x)){
            count++;
          }
        }
      }

      return count;
    }


      public boolean isAnagram(String x){
         int left=0;
         int right=x.length()-1;

         while(left<right){
            if(x.charAt(left)!=x.charAt(right)){
                return false;
            }

            left++;
            right--;
         }

         return true;

    

    }
}
