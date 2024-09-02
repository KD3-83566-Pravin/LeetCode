class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count=0;
        List<Integer> su = new ArrayList<>();
        List<Integer> sa = new ArrayList<>();
        for(int i :students){
            su.add(i);
        }
         for(int i :sandwiches){
            sa.add(i);
        }
        int i=0;
       while(su.size()!=0){
        if(su.get(i).equals(sa.get(i))){
            count=0;
            su.remove(i);
            sa.remove(i);
        }
        else{
            count++;
            su.add(su.get(i));
            su.remove(i);
        }
        if(count==su.size()){
            break;
        }

       }
       return count;

    }
}