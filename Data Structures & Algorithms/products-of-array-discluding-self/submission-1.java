class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length ;
        int [] ans = new int[nums.length];

        int leftpro = 1;

        for(int i = 0; i<n ; i++){
            ans[i] = leftpro;
            leftpro *=nums[i];
        }

        int rightpro = 1;

        for(int i = n-1 ; i >= 0 ; i--){
            ans[i] *= rightpro;
            rightpro *= nums[i];

    }
    return ans;
}  

}
