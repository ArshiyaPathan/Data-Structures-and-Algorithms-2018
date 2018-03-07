class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        int count=0,i=0,j=0;
        Set<Character> set=new HashSet<Character>();
        while(i<len && j<len){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                count=Math.max(count,j-i);
            }else{
                set.remove(s.charAt(i++));
            }
        }
        
        return count;
        
        
    }
}