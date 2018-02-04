/*Given a string s, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.*/
char firstNotRepeatingCharacter(String s) {

    HashMap<Character,Integer>myMap= new HashMap<Character,Integer>();
    
    for(int i=0;i< s.length();i++){
        if(myMap.containsKey(s.charAt(i))){
           
            myMap.put (s.charAt(i), myMap.get(s.charAt(i)) + 1 );
        }
        else
              myMap.put (s.charAt(i), 1);
    }
    for(int i=0;i< s.length();i++){
        if(myMap.get(s.charAt(i)) == 1)
            return s.charAt(i);
    }
    return '_';
}