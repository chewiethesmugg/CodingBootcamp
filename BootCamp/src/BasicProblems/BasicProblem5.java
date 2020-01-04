package BasicProblems;

public class BasicProblem5 {
	public int countTarget(int []nums, int target) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target)count++;
		}
		return count;
	}
}
