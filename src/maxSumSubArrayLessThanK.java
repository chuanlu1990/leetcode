/**
1D problem: maxSumSubArray < k
2D problem: Max Sum of Rectangle No Larger Than K
If no constraint k, complexity of 1D probem reduce from nlogn to n (max sum sub array, dp idea)
*/
//1D solution
    private int maxSumSubArray(int[] nums, int k) {
        TreeSet<Integer> ts = new TreeSet();
        int sum = 0, maxSum = Integer.MIN_VALUE;
        ts.add(sum);
        for(int num : nums) {
            sum +=num;
            Integer x = ts.ceiling(sum-k);
            if(x!=null) {
                maxSum = Math.max(maxSum, sum -x);
            }
            ts.add(sum);
        }
        return maxSum;
    }


//2D solution:
//reduce the problem to 1D, using l/r as sliding window of the other dimension.
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int maxSum = Integer.MIN_VALUE;
        for(int l=0; l<n; l++) {
            int[] sum = new int[m];
            for(int r=l; r<n; r++) {
                for(int p=0; p<m; p++) {
                    sum[p] += matrix[p][r];
                }
                maxSum = Math.max(maxSumSubArray(sum, k), maxSum);
            }
        }
        return maxSum;
    }
