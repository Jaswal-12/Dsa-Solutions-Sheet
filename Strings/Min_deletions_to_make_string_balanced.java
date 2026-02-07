class Solution {
    public int minimumDeletions(String s) {
        
        int bcount=0;
        int del=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='b'){
                bcount++;
            }else{
                if(bcount>0){
                    del=Math.min(del+1,bcount);
                }
            }
        }

        return del;
    }
}
