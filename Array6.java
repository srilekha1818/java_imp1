public class Array6 {
	public static boolean isElementRepeat(int nums[], int n) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}

		return false;


    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1, 2, 3, 1 };
		int n = nums.length;
		boolean elementRepeat = isElementRepeat(nums, n);
		if (elementRepeat)
			System.out.println("true");
		else
			System.out.println("false");

	}

}
