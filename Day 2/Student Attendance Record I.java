https://leetcode.com/problems/student-attendance-record-i/
class Solution {
    public boolean checkRecord(String s) {
        if(s.contains("LLL")){
            return false;
        }
        if(s.indexOf('A') != s.lastIndexOf('A')){
            return false;
        }
        return true;
    }
}

// one line solution

 return !s.contains("LLL") && s.indexOf('A') != s.IndexOf('A');
