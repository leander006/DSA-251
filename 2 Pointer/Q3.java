class Q3 {
	public static int maxArea(int[] height) {
		int maxArea = 0;
		int l = 0;
		int r = height.length-1;
		while(l<r){
			int min = Math.min(height[l],height[r]);
			int currArea = min * (r-l);
			maxArea = Math.max(maxArea, currArea);
			if(height[l]<height[r]){
				l++;
			}
			else{
				r--;
			}
		}
		return maxArea;
	}
}