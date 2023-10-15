class Solution {
    public boolean isPerfectSquare(int num) {
        int sr=0;
        if(num >= 0){
            sr = (int)Math.sqrt(num);
        }
        if(sr * sr == num) return true;
        return false;
    }
}