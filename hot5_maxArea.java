//hot5: 盛水最多的容器
import java.util.Arrays;

public class hot5_maxArea {
    public int maxArea(int[] height){
        int l = 0;
        int r = height.length-1;
        int area = 0;
        while(l < r){
            int ans = Math.min(height[l],height[r]) * (r-l);//要先计算height数组左右两个端点的乘积大小；
            //若是直接判断height[l]和height[r]的大小，然后移动指针，会漏算左右端点的容积大小；因为先判断会要么移动左指针，要么右指针，肯定会移动
            area = Math.max(ans, area);//更新area
            if(height[l] <= height[r]){
                ++l;
            }
            else {
                --r;
            }
        }
        return area;
    }
    public static void main(String[] args){
        hot5_maxArea hot5MaxArea = new hot5_maxArea();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("输入：height = " +Arrays.toString(height));
        int result = hot5MaxArea.maxArea(height);
        System.out.println("输出 :"+result);
    }
}
