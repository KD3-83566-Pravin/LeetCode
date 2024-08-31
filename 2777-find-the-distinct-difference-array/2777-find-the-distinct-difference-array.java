class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n=nums.length;
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            Set<Integer> set= new HashSet<>();
             Set<Integer> set1= new HashSet<>();
            for(int j=i+1;j<n;j++){
                set.add(nums[j]);
            }
            for(int j=i;j>=0;j--){
                set1.add(nums[j]);
            }
            int diff= set1.size() - (set.size());
            arr[i]=diff;
        }
       // arr[n-1]=nums[n-1];
        return arr;
    }
}