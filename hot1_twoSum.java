import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

class hot1_twoSum {
    hot1_twoSum() {
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap();

        for(int i = 0; i < nums.length; ++i) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{(Integer)hashMap.get(target - nums[i]), i};
            }

            hashMap.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        hot1_twoSum solution = new hot1_twoSum();
        int[] nums = new int[]{3, 2, 4};
        int target = 7;
        int[] result = solution.twoSum(nums, target);
        PrintStream var10000 = System.out;
        String var10001 = Arrays.toString(nums);
        var10000.println("输入：nums = " + var10001 + ", target = " + target);
        System.out.println("输出：" + Arrays.toString(result));
    }
}