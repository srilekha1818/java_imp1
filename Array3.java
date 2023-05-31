public class Array3{
public static void main(String[] args) {
    // TODO Auto-generated method stub

    int[] nums = { 1, 3, 5, 6 };
    int val = 5;
    int res[] = new int[nums.length];
    int n = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == val) {
            res[n] = i;
            break;
           
        }
        n++;
    }
	System.out.println(n);



}

}
