class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int digit=0;
        for(int n : nums){
            while(n!=0){
                digit++;
                 n=n/10;
            }
            if(digit%2==0){
                count++;
            }
            digit=0;
        }
        return count;
    }
}