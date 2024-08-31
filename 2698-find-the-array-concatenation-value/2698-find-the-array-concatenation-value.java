class Solution {
    public long findTheArrayConcVal(int[] nums) {
        
        int low = 0;
        int high = nums.length-1;
        
        long ans = 0;
        
        while(low < high){
           
            String s1 = Integer.toString(nums[low]);
            String s2 = Integer.toString(nums[high]);
            
            String s3 = s1 + s2;
            
            ans += (Integer.parseInt(s3));
            
            low++;
            high--;
        }
        
        if(nums.length%2 != 0)
            ans += nums[low];
        
        return ans;
    }
}