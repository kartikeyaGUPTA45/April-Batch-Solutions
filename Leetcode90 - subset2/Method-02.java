class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        Arrays.sort(nums);

        subset(0,nums,l,ans);
        return ans;
    }

    private void subset(int idx, int nums[], List<Integer> l, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(l));

        for(int i=idx; i<nums.length;i++) {
            if (i != idx && nums[i] == nums[i-1]) {
                continue;
            }

            l.add(nums[i]);
            subset(i+1, nums, l,ans);
            l.remove(l.size()-1);
        }

    }
}
