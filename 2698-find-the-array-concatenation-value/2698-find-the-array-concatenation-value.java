class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum=0L;
        int left=0,right=nums.length-1;
        StringBuilder sb= new StringBuilder();
        while(left<=right){
           if(left==right){
            sb.append(nums[left]);
           } else{
            sb.append(nums[left]);
            sb.append(nums[right]);
           }
           Integer value=Integer.parseInt(sb.toString());
           sum+=value;
            left++;
            right--;
            sb.setLength(0);
        }
        return sum;
        
    }
}