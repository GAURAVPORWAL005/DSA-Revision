https://leetcode.com/problems/excel-sheet-column-number/
class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for(int i=0;i<columnTitle.length();i++){
            ans = ans * 26 + 1 + (int)columnTitle.charAt(i) - (int)'A';
        }
        return ans;
    }
}
