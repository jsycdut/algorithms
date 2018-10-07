class Solution {
    public int reverse(int x) {
        int y = 0;
        while(x != 0){
            int n = x % 10;
            if(y > (Integer.MAX_VALUE / 10) || y < (Integer.MIN_VALUE / 10)){
                return 0;
            }
            y = y * 10 + n;
            x  /= 10;
        }
        return y;
    }
}