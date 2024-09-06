class Solution {
    public int lastStoneWeight(int[] stones) {

       ArrayList<Integer> list =new ArrayList<Integer>();
       for (int a : stones)
			list.add(a);

       while(list.size()!=1){
          Collections.sort(list);
          int n=list.size();
          if(n==1 || n==0){
            break;
          }
          int a =list.get(n-1);
          int b =list.get(n-2);
          if(a==b){
            list.remove(n-1);
            list.remove(n-2);


          }
          if(a!=b){
               list.remove(n-1);
              list.remove(n-2);
              list.add(a-b);
          }

       }
    if(list.size()==1){
        return list.get(0);
    }
    return 0;
        
    }
}