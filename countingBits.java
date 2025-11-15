class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for(int i = 0; i <= n; i++){
            int sumBit = 0;
            // So i doesn't get modified in its own loop
            int num = i;

            // Finds the binary number by finding the remainder,
            // and changing num to what it  equals to when divided.
            // until it is 0
            // Finds the sum of the binary number, not the actual binary number
            while(num != 0){
                sumBit += num % 2;
                num = num / 2;
            }

            ans[i] = sumBit;
        }

        return ans;
    }
}
