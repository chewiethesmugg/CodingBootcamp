package BasicProblems;

public class BasicProblem10 {
	public boolean isPalindrome9(int []nums) {
		if(nums==null||nums.length<2)return true;
		int start,end;
		if(nums.length%2==1)start=end=nums.length/2;
		else { start=nums.length/2-1;end=nums.length/2;}
		while(end<=nums.length-1) {
			if((nums[start]-nums[end])!=0)return false;
		}
		return true;
	}


	//optimised version
	public boolean isPalindrome(int []nums) {
		if(nums==null||nums.length<2)return true;
		int end=nums.length-1;
		for(int i=0;i<nums.length/2;i++) {
			if(nums[end-i]!=nums[i])return false;
		}
		return true;
	}
	
}