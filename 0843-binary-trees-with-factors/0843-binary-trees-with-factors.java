class Solution {
    private static final int MOD = 1000000007;
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> un = new HashSet<>();
        for(int num : arr){
            un.add(num);
        }
        Map<Integer,Integer> dp = new HashMap<>();
        for(int num : arr){
            dp.put(num,1);
        }
        for(int i : arr){
            for(int j : arr){
                if(j> Math.sqrt(i)) break;
                if(i%j == 0 && un.contains(i/j)){
                    long var = (long)dp.get(j) * dp.get(i/j);
                    dp.put(i,(int) ((dp.get(i) + (i/j == j ? var: var * 2)) %MOD));
                }
            }
        }
        int ans =0;
        for(int x : dp.values()){
            ans = (ans + x) % MOD;
        }
        return ans;
    }
}