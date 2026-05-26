class Solution {
    public int maxArea(int[] heights) {

        int maxarea = 0 ;

        int left = 0 ;
        int right = heights.length - 1;

        while(left < right){
            int width = right - left;
            int minHeight = Math.min(heights[left] , heights[right]);

            int curarea = width*minHeight;
            maxarea = Math.max(maxarea , curarea);

            if(heights[right] > heights[left]){
                left ++;
            }
            else
            right -- ;
        }

        return maxarea;



        
    }
}
