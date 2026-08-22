class Solution {
    public int[] countBits(int n) {
        int[] rep = new int[n+1];
        for(int i = 0; i < rep.length; i ++) {
            rep[i] = hammingWeight(i);
        }
        return rep;
    }
    public int hammingWeight(int n) {
        int ones = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                ones++;
            }
            n >>= 1;
        }
        return ones;
    }
}

