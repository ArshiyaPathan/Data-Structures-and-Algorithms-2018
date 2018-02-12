/*A string S of lowercase letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.

Example 1:
Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts*/

import java.util.Hashtable;
class Solution {
    public List<Integer> partitionLabels(String S) {
        
        Hashtable<Character, Integer> IndexLast = new Hashtable<Character, Integer>();
        List<Integer> result = new ArrayList<Integer>();
        int last=0;
        int start=0;
        
        for(int i=0;i<S.length();i++){
            IndexLast.put(S.charAt(i),i);
        }
        
        for(int i=0;i< S.length();i++){
            last= Math.max(last, IndexLast.get(S.charAt(i)));
            if(i==last){
                result.add(last-start+1);
             start= last+1;   
            }
        }
        return result;
    }
}