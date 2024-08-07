class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int num = Math.abs(nums[i]);
            int index = num - 1;
            if(nums[index] > 0){
                nums[index] *= -1;
            }
        }

        for(int i = 0; i < nums.length; i++){
           if(nums[i] > 0){
            result.add(i + 1);
           }
       }
        return result;
    }
}
