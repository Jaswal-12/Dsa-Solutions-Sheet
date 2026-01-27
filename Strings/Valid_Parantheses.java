class Solution {
    public boolean isValid(String s) {
          

          Stack<Character>hs=new Stack<>();

          for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                hs.push(s.charAt(i));
            }else{
                if(hs.isEmpty()) return false;
                char top=hs.pop();

                if((ch==')' && top!='(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;

            }
            }
          }
          
          return hs.isEmpty();
         
    }
}
