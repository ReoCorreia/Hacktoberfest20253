class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i != 0 && nums[i-1] == nums[i]) continue;

            int j = i + 1;
            int k = nums.length - 1;
            while(j<k){
                int temp = nums[i] + nums[j] + nums[k];
                if(temp < 0){ 
                    j++;
                }else if(temp > 0){
                    k--;
                }else{
                    List<Integer> tem = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(tem);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }

            }
        }


        return ans;
    }
}
