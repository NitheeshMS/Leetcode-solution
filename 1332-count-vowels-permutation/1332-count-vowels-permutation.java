class Solution {
    public int countVowelPermutation(int n) {
        long[] counts = {1L,1L,1L,1L,1L};
        int MOD = 1000000007;

        for(int x = 2; x <= n; x++) {
            //a can follow e, i and u
            long a = counts[1] + counts[2] + counts[4];
            //e can follow a and i
            long e = counts[0] + counts[2];
            //i can follow e and o
            long i = counts[1] + counts[3];
            //o can follow i
            long o = counts[2];
            //u can follow i and o
            long u = counts[2] + counts[3];

            counts[0] = a % MOD;
            counts[1] = e % MOD;
            counts[2] = i % MOD;
            counts[3] = o % MOD;
            counts[4] = u % MOD;
        }

        return (int)((counts[0] + counts[1] + counts[2] + counts[3] + counts[4])%MOD);
    }
}