class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> s = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);

        subset(0,nums, s,l);

        return new ArrayList<>(s);
    }

    public void subset(int idx, int nums[], Set<List<Integer>> s, List<Integer> l) {
        if (idx == nums.length) {
            s.add(new ArrayList<>(l));
            return;
        }

        l.add(nums[idx]);
        subset(idx+1,nums,s,l);
        l.remove(l.size()-1);
        subset(idx+1,nums,s,l);
    }
}
