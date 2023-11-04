class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int time_req=0;
        for(int i=0;i<left.length;i++){
            time_req= Math.max(time_req,left[i]);
        }
        for(int i=0;i<right.length;i++){
            time_req = Math.max(time_req, n -right[i]);
        }
        return time_req;
    }
}