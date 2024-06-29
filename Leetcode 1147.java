class Solution {
    public int longestDecomposition(String text) {
        int ans = 1;
        int n = text.length();

        for (int i = 1; i <= n / 2; i++) {
            String pre = text.substring(0, i);
            String suf = text.substring(n - i, n);

            if (pre.equals(suf)) {
                ans += 2;
                text = text.substring(i, n - i);
                i = 0;
                n = text.length();
                if (text.length() == 0) ans--;
            }
        }

        return ans;
    }
}
