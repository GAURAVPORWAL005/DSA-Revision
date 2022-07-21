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

// brute force approach
class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        char[] ans = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ans[i] == 'A'){
                absent++;
                if(absent == 2)
                    return false;
            }
            if(ans[i] == 'L'){
                late++;
            }
                if(ans[i] == 'A' || ans[i] == 'P'){
                    late = 0;
                }
                    if(late > 2)
                        return false;   
        }
        return true;
    }
}
