https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
// using stack
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        String ans = "";
        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }
        return ans;
    }
}
time complexity = > O(n)
  space complexity => O(n)
