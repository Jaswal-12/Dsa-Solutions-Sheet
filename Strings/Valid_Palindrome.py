#Leetcode-125
class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }


        String x=sb.toString();
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
