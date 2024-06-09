class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            int num = nums[i];
            int value = target - num;
            if (map.containsKey(value)) {
                int res[] = new int[2];
                res[0] = map.get(value);
                res[1] = i;
                return res;
            }

            map.put(num, i);
        }

        return new int[2];
        
    }
}
