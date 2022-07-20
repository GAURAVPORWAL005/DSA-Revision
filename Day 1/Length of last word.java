https://leetcode.com/problems/length-of-last-word/
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) !=' '){
                count++;
            }
            else{
                if(count > 0){
                    return count;
                }
            }
        }
        return count;
    }
}
// time complexity => O(n)

// using function
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length()-lastIndex;
    }
}
