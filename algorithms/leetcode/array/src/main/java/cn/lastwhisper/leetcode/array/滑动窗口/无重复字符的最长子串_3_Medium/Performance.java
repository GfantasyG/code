package cn.lastwhisper.leetcode.array.滑动窗口.无重复字符的最长子串_3_Medium;

import java.lang.reflect.Method;
import java.lang.Class;

// 比较这个工程中 Solution1, Solution5, Solution6, Solution4 和 Solution3 的算法运行效率
public class Performance {

    public static void testPerformance(String algoClassName, String algoName, String s){

        try{
            Class algoClass = Class.forName(algoClassName);
            Object solution = algoClass.newInstance();

            // 通过排序函数的Class对象获得排序方法
            Method algoMethod = algoClass.getMethod(algoName, String.class);

            long startTime = System.currentTimeMillis();
            // 调用算法
            Object resObj = algoMethod.invoke(solution, s);
            long endTime = System.currentTimeMillis();

            int res = (Integer)resObj;
            System.out.print(algoClassName + " : res = " + res + " ");
            System.out.println("Time = " + (endTime-startTime) + " ms" );
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        int n = 10000000;

        StringBuilder s = new StringBuilder(n);
        for(int i = 0 ; i < n ; i ++)
            s.append((char)(Math.random()*95 + 32));

        System.out.println("Test: 10,000,000 length of completely random string:");
        testPerformance("cn.lastwhisper.leetcode.array.滑动窗口.无重复字符的最长子串_3_Medium.Solution1", "lengthOfLongestSubstring", s.toString());
        testPerformance("cn.lastwhisper.leetcode.array.滑动窗口.无重复字符的最长子串_3_Medium.Solution2", "lengthOfLongestSubstring", s.toString());
        testPerformance("cn.lastwhisper.leetcode.array.滑动窗口.无重复字符的最长子串_3_Medium.Solution3", "lengthOfLongestSubstring", s.toString());
        testPerformance("cn.lastwhisper.leetcode.array.滑动窗口.无重复字符的最长子串_3_Medium.Solution4", "lengthOfLongestSubstring", s.toString());
        testPerformance("cn.lastwhisper.leetcode.array.滑动窗口.无重复字符的最长子串_3_Medium.Solution5", "lengthOfLongestSubstring", s.toString());
        testPerformance("cn.lastwhisper.leetcode.array.滑动窗口.无重复字符的最长子串_3_Medium.Solution6", "lengthOfLongestSubstring", s.toString());

    }
}
