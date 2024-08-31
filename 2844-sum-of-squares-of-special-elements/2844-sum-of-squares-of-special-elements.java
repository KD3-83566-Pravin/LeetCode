class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                int value=nums[i-1];
                int squr =(int)Math.pow(value,2);
                sum=sum+squr;
            }
        }
        return sum;
        
    }
}