package week1.day2;

// Problem statement

// int nums[]= {2, 11, 15, 7, 3,5,4 };
// target = 9

// 2, 11, 15, 7, 3,5,4 
// 2 + 11 
// 2 + 15
// 2 + 7
// 2 + 3
// 2 + 5
// 2+ 4

//0  1   2   3  4 5 6
//2, 11, 15, 7, 3,5,4

//   1   2  3   4 5 6
//   11, 15, 7, 3,5,4


public class TwoSumProblem {
	public static void main(String[] args) {
		
		int nums[]= {2, 11, 15, 7, 3,5,4,8,1 };
		int target = 9;
		
		for (int i = 0; i < nums.length; i++) {
			//System.out.println(" i value:" + i);
			//2
			for (int j = i+1 ; j < nums.length; j++) {
			//	System.out.println(" j value: " + j);
				if ((nums[i] + nums[j]) == target){
					System.out.println(nums[i] + "with index" + i);
					System.out.println(nums[j] + "with index" + j);
				}
			}
		}
	}
	


}
