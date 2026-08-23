class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int arr[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int s = target-nums[i];
            if(map.containsKey(s) && (map.get(s)!=i))
            {
                arr[1] = i;
                arr[0] = map.get(target-nums[i]);
                return arr;
            }
            else{
                            map.put(nums[i], i);

            }
        }
        return arr;
    }
}
