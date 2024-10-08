class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map= new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int val : map.values()){
            if(!set.contains(val)){
                   set.add(val);
            }
            else{
                return false;
            }
        }
        return true;
    }
}