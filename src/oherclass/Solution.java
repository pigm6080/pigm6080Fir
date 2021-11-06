package oherclass;
class Solution {
    public int[][] solution(int[][] nums) {
        
        int temp[] = new int[5];
    	for(int i=0;i<5;i++) {
        	for (int j = 0; j < 4; j++) {
        		if(nums[i][j] == nums[i][j+1]) {
        			temp[i] = nums[i][j];
        			nums[i][j] =0;
        		}
			}
        }
    	for (int i = 0; i < 5; i++) {
    		if (nums[i][4] == temp[i]) {
    			nums[i][4] = 0;
    		}
			
		}
        for(int i=0;i<5;i++) {
        	for (int j = 0; j < 4; j++) {
        		if(nums[j][i] == nums[j+1][i]) {
        			nums[j][i] =0;
        		}
			}
        }
        int[][] answer = nums;
        return answer;
    }
}