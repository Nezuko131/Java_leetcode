//hot 4：移动零
import java.util.Arrays;

//public class hot4_moveZeroes {
//    public int[] moveZeroes(int[] nums){
//        int n = nums.length;
//        int j =0;
//        for (int i = 0;i < n; i++){
//            if(nums[i] != 0){
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                j++;
//            }
//        }
//        return nums;
//    }
//    public static  void main(String[] args) {
//        hot4_moveZeroes hot4MoveZeroes = new hot4_moveZeroes();
//        int[] nums = {0,1,0,3,12};
//        System.out.println("输入： = " + Arrays.toString(nums));
//        int[] result = hot4MoveZeroes.moveZeroes(nums);
//        System.out.println("输出：" + Arrays.toString(result));
//    }
//}


public class hot4_moveZeroes {
    public int[] moveZeroes(int[] nums){
        int n = nums.length;
        int j =0;
        for (int i = 0;i < n; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i<n; i++){
            nums[i] = 0;
        }
        return nums;
    }
    public static  void main(String[] args) {
        hot4_moveZeroes hot4MoveZeroes = new hot4_moveZeroes();
        int[] nums = {0,1,0,3,12};
        System.out.println("输入： = " + Arrays.toString(nums));
        int[] result = hot4MoveZeroes.moveZeroes(nums);
        System.out.println("输出：" + Arrays.toString(result));
    }
}

