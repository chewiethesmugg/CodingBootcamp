package BasicProblems;

public class BasicProblem8 {
	public int maxOddNumber(int []nums){
		if(nums==null||nums.length==0)return Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==1&&nums[i]>max)max=nums[i];
		}
		return max;
	}
}
