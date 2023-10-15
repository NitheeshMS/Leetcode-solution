class Solution {
    public char findTheDifference(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            int ch = (int)c;
            sum1 = sum1 + ch;
        }

        for (int i=0;i<t.length();i++) {
            char c = t.charAt(i);
            int ch = (int)c;
            sum2 = sum2 + ch;
        }

        return (char)(sum2 - sum1);
        
    }
}