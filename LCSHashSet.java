class Solution{
  public int longestConsecutiveSequence(int[] nums){

    // Puts all the #s in the into a HashSet for O(1) lookup
    Set<integer> numSet = new HashSet<>();
    for(int num : nums){
      numSet.add(num);
    }

    int longest = 0;

    for(int num : numSet){
      // Start of a sequence
      if(!numSet.contains(num - 1)){
        int cur = num;
        int curStreak = 1;

        // While the next consequetive # exists
        while(numSet.contains(cur + 1)){
          cur++;
          curStreak++;
        }

        // Updates the max streak
      longest = Math.max(longest, curStreak);
    }
  }

  return longest;
}      
