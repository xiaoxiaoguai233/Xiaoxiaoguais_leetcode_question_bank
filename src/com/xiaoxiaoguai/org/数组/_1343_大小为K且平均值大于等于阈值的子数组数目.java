package com.xiaoxiaoguai.org.数组;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-12 4:44 上午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * @UsingIDEA IntelliJ IDEA
 */

public class _1343_大小为K且平均值大于等于阈值的子数组数目 {

    public static void main(String[] args) {

    }
    //思路：
    //step1 ： 取出前k个数求和，然后减去k*threshold ，如果结果大于0，说明符合要求。
    //step2 ： 指针后移一位，用后移一位的值减去移动之前的第一位的值，再加上上次减法的结果，如果大于0，说明符合要求
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0 ,result=0;
        int sumTarget = k*threshold;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int adder = sum - sumTarget;
        if (adder >= 0) {
            result++;
        }
        int pos = k;
        for (int i = 0; i < arr.length-k; i++) {
            adder = adder+arr[pos]-arr[i];
            if (adder>=0){
                result++;
            }
            pos++;
        }
        return result;
    }
}
