class Solution {
    public int[] numberGame(int[] nums) {
    Arrays.sort(nums);
    int arr[] = new int[nums.length];
   for(int i=0;i<nums.length;){
         int temp=nums[i];
         nums[i]=nums[i+1];
         nums[i+1]=temp;
         i+=2;
   }
   return nums;

}
}