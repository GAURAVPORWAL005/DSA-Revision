https://leetcode.com/problems/valid-palindrome/
// using built in functions
class Solution {
    public boolean isPalindrome(String s) {
        String New = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reverse = new StringBuffer(New).reverse().toString();
        return New.equals(reverse);
    }
}


// other Approach
class Solution {
    public boolean isPalindrome(String s) {
        String newString = validPalindrome(s);
        int start = 0;
        int end = newString.length()-1;
        while(start < end){
            if(newString.charAt(start) != newString.charAt(end)){
                return false;
            }
            else
                start++;
            end--;
        }
        return true;
    }
    public String validPalindrome(String s){
        String ans = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        return ans;
    }
}
time complexity => O(n)
