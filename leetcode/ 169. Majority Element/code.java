class Solution {
    public int majorityElement(int[] nums) {
        int ret = 0;
        int m = 0;
        for(int num : nums) {
            if(m == 0) ret = num;
            m += ret == num ? 1 : -1;
        }
        return ret;
    }
}