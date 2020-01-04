package BasicProblems;

public class BasicProblem3 {
	public boolean only14(int []nums) {
		for(int i=0;i<nums.length;i++) {
			if(i!=1 || i!=4)return false;
		}
		return true;
	}
}
