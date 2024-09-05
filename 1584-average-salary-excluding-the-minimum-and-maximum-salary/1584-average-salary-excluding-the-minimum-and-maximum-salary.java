class Solution {
    public double average(int[] salary) {
        double avg;
        double n= salary.length-2;
       Arrays.sort(salary);
       int sum=0;
       for(int i =1;i<salary.length-1;i++){
         sum=sum+salary[i];
       }
       avg=sum/n;
       return avg; 
    }
}