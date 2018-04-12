class Solution {
    public int myAtoi(String str)
    { 
        System.out.println("the length of the string is " + str.length() );
        // have a sum to return as the result, starting at the lowest # possible
        int sum = 0;
        
        // check for empty strings. 
        // (Even empty strings have an escape char denoting the end of the string)
        if (str.length() > 1)
        {
            // go through the chars in the string, starting at the back
            for (char strElmt : str.toCharArray() )
            {  //  check if strElmt is a letter, ie, if the ascii val is btwn a & Z
                // int valOfElmt = String.valueOf(strElmt);
                // int valOfa = String.valueOf('a');
                // int valOfZ = String.valueOf('Z');
                // boolean charG8orThanA = (valOfElmt >= valOfa);
                // boolean charLessThanZ = (valOfElmt <= valOfZ);
            
                // checking if the sum is less than 32 bit signed int ranges
                if (sum < 0x7fffffff && charG8orThanA && charLessThanZ)
                {
                sum += String.valueOf(strElmt);
                } else{
                    continue;
                }
            }
        } else {
            sum = 0;
        }
        return sum;
    }
}
