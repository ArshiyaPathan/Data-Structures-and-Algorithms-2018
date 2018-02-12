class Solution {
    public String convert(String s, int numRows) {
        if(numRows<=1)
        return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0; i<sb.length;i++){
            sb[i] = new StringBuilder("");    
        }
        
        int r=0;
        int incr=0;
        for(int i=0;i< s.length();i++){
            
            sb[r].append(s.charAt(i));
            if(r == numRows-1)
                incr=-1;
            else if(r== 0) 
                incr = 1;
            r = r + incr; 
        }
        
        String result="";
        
        for(int i=0; i<sb.length;i++){
            result+= sb[i];
        }
     return result.toString();   
    }
}