package Recollect;

public class Maxandminimuminarray {

	public static void findmaxandmin(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			} else if (nums[i] < min) {
				min = nums[i];
			}
		}

		System.out.println("The Maximum value of array is:" + max);
		System.out.println("The Minimum value of array is:" + min);

	}

	public static void main(String[] args) {

		int nums[] = { 25, 63, 49, 84, 98, 51, };
		// TODO Auto-generated method stub
		findmaxandmin(nums);

	}

}
