class Solution {
    public boolean isAnagram(String s, String t) {
        // If either string is empty
        if(s == null || t == null){
            return false;
        }

        // If they're not the same length,
        // then t can't be an anagram of s
        if(s.length() != t.length()){
            return false;
        }

        // Arrays of characters from the strings
        // Made to be lowercase so they're all the same
        char[] sArr = s.toLowerCase().toCharArray();
        char[] tArr = t.toLowerCase().toCharArray();

        // Sorting so the order doesn't matter,
        // since an anagram is the same letters,
        // and the order doesn't matter
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }
}
