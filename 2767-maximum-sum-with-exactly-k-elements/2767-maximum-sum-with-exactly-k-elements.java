class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum=0;
        Arrays.sort(nums);
        int n=nums[nums.length-1];
        for(int i=0;i<k;i++ ){
            sum=sum+(n+i);
        }
        return sum;
        
    }
}