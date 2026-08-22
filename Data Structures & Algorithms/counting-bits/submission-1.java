class Solution {
    public int[] countBits(int n) {
     int[] rep = new int[n+1];
        for(int i = 0; i < rep.length; i ++) {
            rep[i] = rep[i >> 1] + (i & 1);
        }
        return rep;
    }
}
