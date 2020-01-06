package BasicProblems;

public class BasicProblem9 {
	public int[] swapEnds(int[] nums) {
		if(nums==null)return null;
		if(nums.length<1)return nums;
		int temp=nums[0];
		nums[0]=nums[nums.length-1];
		nums[nums.length-1]=temp;
		return nums;
	}
}
