class Solution{
  public boolean isAnagram(String s, String t){
    if(s.length() != t.length()){
      return false;
    }

    // An array to count letters
    int[] counts = new int[26];

    // The count for s gets incremented for a letter,
    // and if there's a letter like that in the t string,
    // then it will decremenet the count
    for(int i = 0; i < s.length(); i++){
      counts[s.charAt(i) - 'a']++;
      counts[t.charAt(i) - 'a']--;
    }

    // So if all the letters match,
    // then the counts will equal 0,
    // since all the letters are the same
    for(int count : counts){
      if(count != 0){
        return false;
      }
    }

    return true;
  }
}
