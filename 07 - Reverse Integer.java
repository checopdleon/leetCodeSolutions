class Solution {
    public int reverse(int x) 
    {
        if (x == 0) return 0;
        
        //check if we're dealing with a pos or a neg number
        boolean negative = false;
        
        // convert to a data struc that we can mess with
        String stringOfX = Integer.toString(x);
        if(stringOfX.charAt(0) == '-')
        {
            stringOfX = stringOfX.substring(1);
            negative = true;
        }
        
        // make a place to store the digits
        Stack<Integer> digitsInX = new Stack<Integer>();
        
        for( int i = 0; i < (stringOfX.length() ); i++)
        { // place every digit in the number into the int array by:
                // get the char
                char number = stringOfX.charAt(i);
                // make the char a string
                String n = Character.toString(number);
                // then Integer.valueOf(string that is one char long)
                int digit = Integer.valueOf(n);
                // then push the int
                digitsInX.push(digit);
        }
        // make a string to pop all the digits into
        String numsInReverse = "";
        
        // pop what I have in the stack into the string
        while(!digitsInX.isEmpty() )
        {
            // pop int
            int newNum = digitsInX.pop();
            // change the int to string and concat into the new string
            numsInReverse += Integer.toString(newNum);
        }
        
        // chop off leading zeros
        while (numsInReverse.charAt(0) == '0')
        {
            numsInReverse = numsInReverse.substring(1 );
        }
        
        // return the negative sign if the number passed in was a negative
        int result;
        if (negative)
        {
            result = Integer.valueOf("-"+numsInReverse);
        } else {
            result = Integer.valueOf(numsInReverse);
        }
        
        if (result < 0x80000001 | result > 0x7FFFFFFF)
            result = 0;
        
        return result;
    }
}
