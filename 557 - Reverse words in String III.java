class Solution {
    public String reverseWords(String s) {
        
        // declare all variables needed
        String ans = "";
        Stack<Character> letters = new Stack<Character>();
        letters.add(' ');
        int i = 0; // to index position in the 's' string
        
        // go through the original string
        while( i < s.length() ){

            if (s.charAt(i) != ' ') {
                letters.add(s.charAt(i));
            }
            else if (s.charAt(i) == ' ') {
                while (!letters.isEmpty() ) {
                    ans += letters.pop();
                }
                letters.add(' ');
            }
            i++;
        }
        
        // pop out the last letters in the stack
        i = 0;
        int size = letters.size();
        while (i++ < size - 1) {
            ans += letters.pop();
        }
        
        return ans;
    }
}
