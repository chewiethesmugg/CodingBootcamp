package BasicProblems;

public class BasicProblem11 {
	public boolean isSameArrays(int[] arr1, int[] arr2) {
		if(arr1==null&&arr2==null)return true; //gotta be null at the same time
		if(arr1.length==0||arr2.length==0||arr1.length!=arr2.length)return false;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i])return false;
		}
		return true;
	}
}
