import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//hot 2：字母异位词分组
class hot2_groupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();//初始化哈希表
        for(int i = 0; i<strs.length;i++){
            char[] chars = strs[i].toCharArray();//将字符串以数组形式存储
            Arrays.sort(chars);//将字母进行排序，字母异位词的单词排完序后应该都完全相同
            String key = new String(chars);//将排完序的数组作为hashmap的key
            //hashMap.getOrDefault函数：根据hashmap的key获取value（即字母异位词），若是没有这个key，则返回一个空的list
            List<String> list = hashMap.getOrDefault(key,new ArrayList<>());//声明一个类型种类为List<String>的list，因为每个字母异位词的组成形式为List<String>
            list.add(strs[i]);//将字母异位词的对应字母加入到相应list中
            hashMap.put(key, list);//根据key存放list
        }
        return new ArrayList<>(hashMap.values());//返回不同key下的value
    }
    public static void main(String[] args){
        hot2_groupAnagrams solutiongroupAnagrams = new hot2_groupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat","eata"};
        System.out.println("输入：strs = " + Arrays.toString(strs));
        List<List<String>> result = solutiongroupAnagrams.groupAnagrams(strs);
        System.out.println("输出：" + result);
    }
}
