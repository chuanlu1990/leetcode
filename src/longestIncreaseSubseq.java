/**Given an unsorted array of integers, find the length of longest increasing subsequence.
Russian doll envelop-- LIS in two dimensions, width and height. Sorting the width reduces the problem by one dimension. If width is strictly increasing, the problem is equivalent to finding LIS in only the height dimension. However, when there is a tie in width, a strictly increasing sequence in height may not be a correct solution. For example, [[3,3] cannot fit in [3,4]]. Sorting height in descending order when there is a tie prevents such a sequence to be included in the solution.

The same idea can be applied to problems of higher dimensions. For example, box fitting is three dimensions, width, height, and length. Sorting width ascending and height descending reduces the problem by one dimension. Finding the LIS by height further reduces the problem by another dimension. When find LIS based on only length, it becomes a standard LIS problem.
*/
public int lengthOfLIS(int[] nums) {
        int len = 0;
        int[] dp = new int[nums.length];
        for(int num : nums) {
            int index = Arrays.binarySearch(dp, 0, len, num);
            if(index<0) {
                index = -(index+1);
            }
            dp[index] = num;
            if(index==len) {
                len++;
            }
        }
        return len;
    }
