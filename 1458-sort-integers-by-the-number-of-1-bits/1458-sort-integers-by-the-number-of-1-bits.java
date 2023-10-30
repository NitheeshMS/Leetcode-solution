class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        for(int i =0;i< n;i++){
            ans[i] = countBit(arr[i]) * 10001 + arr[i];
        }
        Arrays.sort(ans);
        for(int i =0;i<n;i++){
            ans[i] %= 10001;
        }
        return ans;
    }
    public int countBit(int n){
        int res = 0;
        while( n != 0){
            res += (n & 1);
            n >>= 1;
        }
        return res;
    }
}