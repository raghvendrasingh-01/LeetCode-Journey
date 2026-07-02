class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length, ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            int currentDegree = 0;
            for (int j = 0; j < n; j++)
                currentDegree += matrix[i][j];
            ans[i] = currentDegree;
        }
        return ans;
    }
}
