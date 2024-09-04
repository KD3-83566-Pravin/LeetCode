class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int  count=0;
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int frist=Math.abs(arr[i]-arr[j]);
                if(frist<=a){
                    for(int k =j+1;k<n;k++){
                        int second=Math.abs(arr[j]-arr[k]);
                        if(second<=b){
                        int thrid=Math.abs(arr[i]-arr[k]);
                        if(thrid<=c){
                            count++;
                        }
                        }
                        
                        
                    }
                }
            }
        }
        return count;
        
    }
}