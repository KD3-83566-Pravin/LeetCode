class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int ans=0;
        for(int i :nums){
            ans=ans + encrtypte(i);
        }  
        return ans;
    }
    public static int encrtypte(int i){
        int ans=0;
            int max=0;
            int digit=0;
            while(i!=0){
              int  rem=i%10;
                max=Math.max(max,rem);
                digit++;
                i=i/10;
            }
        
        while(digit!=0){
            ans =ans*10+max;
            digit--;
        }
        return ans;
    }
}
