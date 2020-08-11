package com.xiaoxiaoguai.org.数组;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-12 5:14 上午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * @UsingIDEA IntelliJ IDEA
 */

public class 剑指_Offer_53_II_0到n减1中缺失的数字 {

    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,9};
        System.out.println(missingNumber(array));
    }

    public static int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}
