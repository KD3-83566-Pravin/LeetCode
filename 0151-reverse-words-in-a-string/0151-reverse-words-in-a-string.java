class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String [] str = s.split("\\s+");
        StringBuilder sb= new StringBuilder("");
       for(int i=str.length-1; i>0;i--){
       String temp = str[i];
       sb.append(temp);
       sb. append(" ");
       }
       sb.append(str[0]);
       return sb.toString();
    }
}