//hot6：三数之和
import java.util.*;

public class hot6_threeSum {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        //数组排序
        Arrays.sort(nums);
        //k为第一个指针，目的将三数之和转化为两数之和
        for(int k = 0; k < nums.length-2; k++){
            if (nums[k]>0){
                break;
            }
            if(k>0 && nums[k]==nums[k-1]) continue;
            //i和j分别为k的下一个指针和末尾指针
            int i =k+1;
            int j = nums.length-1;

            while (i < j){
                int sum = nums[k]+nums[i]+nums[j];
                if(sum < 0){
                    //防止出现重复的三位数
                    while(i<j && nums[i] == nums[++i]);//&&为短路与，即当前面为false时直接跳出循环，不会再判断后面
                    //nums[i] == nums[++i])的意思为：假设当先的i为1，那么nums[i] = nums[1]；然后将i=i+1=2；最后判断nums[1]和nums[2]是否相等，即++i是将i先加1再比较，这是i在后面执行时已经变为2
                } else if (sum > 0) {
                    //防止出现重复的三位数
                    while (i<j && nums[j] == nums[--j]);
                }
                else {
                    list.add(new ArrayList<Integer>(Arrays.asList(nums[k],nums[i],nums[j])));
                    //防止出现重复的三位数
                    while(i < j && nums[i] == nums[++i]);
                    while(i < j && nums[j] == nums[--j]);
                }
            }
        }
        return list;
    }

    public static void main(String[] args){
        hot6_threeSum hot6ThreeSum = new hot6_threeSum();
        int[] nums = {-2,-2,-2,3,4,-1,0};
        System.out.println("输入：nums = " + Arrays.toString(nums));
        List<List<Integer>> result = hot6ThreeSum.threeSum(nums);
        System.out.println("输出：" + result);
    }
}
