class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count =0;
        for(int i : nums1){
            for(int j : nums2){
                int x=j*k;
                if(i%x==0){
                    count++;
                }
            }
        }
        return count;
    }
}