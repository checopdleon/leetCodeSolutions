/* I went for a brute force solution.  It has quadratic time complexity, Big O(n**2).
 * It's great at saving space though! I only allocated a new two element array.
 */


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        
        if (nums.length == 0) {
            results[0] = results[1] = 0;
        }
        int lftvr;
        for (int i = 0; i < nums.length; i++) {
            lftvr = target - nums[i];
            
            for (int j = ((i + 1) % nums.length); j != i; j %= nums.length) {
                if (nums[j] == lftvr) {
                    results[0] = i;
                    results[1] = j;
                    return results;
                }
                j++;
            }
        }
        return results;
    }
}