class Solution {
    public int hammingWeight(int n) {
        // Starts with 1 in the count
        // because the while loop will stop when
        // n / 2 != 0, so it won't count the last remainder
        // 1 / 2 = 0 R 1
        int numSetBits = 1;

        // While the # is still divisble
        while((n/2) != 0){
            // Increment the numSetBits when the remaider = 1
            if(n % 2 == 1){
                numSetBits++;
            }
            // So the n updates
            n = n / 2;
        }

        return numSetBits;
    }
}
