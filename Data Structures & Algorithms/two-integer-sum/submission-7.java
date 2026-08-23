class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        int arr[] = new int[2];
        for(int i=0;i<n;i++){
            int s = target-nums[i];
            if(map.containsKey(s) && (map.get(s)!=i))
            {
                arr[0] = i;
                arr[1] = map.get(target-nums[i]);
                return arr;
            }
        }
        // Arrays.sort(arr);
        return arr;
    }
}
