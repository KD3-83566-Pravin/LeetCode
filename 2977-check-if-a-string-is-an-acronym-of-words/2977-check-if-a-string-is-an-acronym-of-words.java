class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb= new StringBuilder("");
         for(String str : words){
            char c = str.charAt(0);
            sb.append(c);
         }
         String str=sb.toString();
          return str.equals(s);
           
    }
}