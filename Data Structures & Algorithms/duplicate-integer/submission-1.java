class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        int j = 1;
        boolean flag = false;
        Arrays.sort(nums);
        for (int i = 0; i < n-1; i++) {
            if (nums[i] == nums[j]) {
                flag = true;
                break;
            } else {
                j++;
            }
        }
        return flag;
    }
}