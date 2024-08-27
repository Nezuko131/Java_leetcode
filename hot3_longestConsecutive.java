import java.util.Arrays;
import java.util.HashSet;

//hot3： 最长连续序列
public class hot3_longestConsecutive {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();//hashset为无序、不重复元素集合
        //去除输入的的重复元素
        for(int i = 0; i<nums.length;i++){
            set.add(nums[i]);
        }
        //初始化最长连续
        int longestConsecutive = 0;

        //遍历set中的元素，其中for (int num : set)中的num为set集合中具体的数值，不是下标，一直遍历所有set数值
        for (int num : set) {
            //判断当前的数值-1是否包含在set中，若没有则将其设为开头；若有，则直接跳过
            if(!set.contains(num-1)){
                int currentnum = num;
                int currentstreak = 1;
                //判断当前数值+1是否存在于set集合中，若是存在，则继续循环；若是不存在，则将longestConsecutive变为Math.max(longestConsecutive,currentstreak);
                while(set.contains(currentnum+1)){
                    currentstreak+=1;
                    currentnum+=1;
                }
                longestConsecutive = Math.max(longestConsecutive,currentstreak);
            }
        }
        return longestConsecutive;
    }
    public static void main(String[] args) {
        hot3_longestConsecutive hot3LongestConsecutive = new hot3_longestConsecutive();
        int[] nums = new int[]{100, 4, 200, 1, 3, 2, 4, 5};
        int result = hot3LongestConsecutive.longestConsecutive(nums);
        System.out.println("输入：nums = " + Arrays.toString(nums));
        System.out.println("输出：" + result);
    }
}
