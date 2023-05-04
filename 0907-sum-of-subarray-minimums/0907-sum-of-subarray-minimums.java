class Solution {
    public int sumSubarrayMins(int[] A) {
        int kMod = 1000000007;
        int n = A.length;
        int ans = 0;
        for (int i = 0; i < n; ++i) {
        int left = 0;
        for (int j = i - 1; j >= 0 && A[j] > A[i]; --j, ++left);
        int right = 0;
        for (int j = i + 1; j < n && A[j] >= A[i]; ++j, ++right);
        ans = (int)((ans + (long)A[i] * (left + 1) * (right + 1)) % kMod);
        }
        return ans;
    }
}