class Solution {
    public int maximumValue(String[] strs) {
        int ans=0;
        int value=0;
        for(String str : strs){
            int n=check(str);
            if(n==1){
                 value=Integer.parseInt(str);
            }
            else{
                 value=str.length();
            }
             ans = Math.max(ans,value);
        }
     return ans;
        
    }
    public int check(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                count++;
            }
        }
        if(count==str.length()){
            return 1;
        }
        return -1;
    }
}