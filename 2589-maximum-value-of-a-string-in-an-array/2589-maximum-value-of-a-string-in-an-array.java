class Solution {
    public int maximumValue(String[] strs) {
        int ans = 0;
        for(int i=0;i<strs.length;i++){
            int num = strs[i].matches("\\d+") ? Integer.parseInt(strs[i]) :strs[i].length();
            ans = Math.max(ans,num);
        }
        return ans;
    }
}