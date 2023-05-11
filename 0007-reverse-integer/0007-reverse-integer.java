class Solution {
    public int reverse(int x) {
        long reverse = 0;
        int num = x;
        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) return 0;
        return (int) reverse;
    }
}