class Solution {
    public int maxProduct(int[] nums) {
     int fristMax=Integer.MIN_VALUE;
     int secondMax=Integer.MIN_VALUE;
     for(int n : nums){
        if(n>fristMax){
            secondMax=fristMax;
            fristMax=n;
        } else if(n>secondMax){
           secondMax=n;
        }
     }
     int ans=(secondMax-1)*(fristMax-1);
     return ans;
    }
}