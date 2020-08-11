package com.xiaoxiaoguai.org.数组;

import java.util.Arrays;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-12 4:05 上午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * @UsingIDEA IntelliJ IDEA
 */

public class _1051_高度检查器 {

    public static void main(String[] args) {

        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] temp = heights.clone();
        Arrays.sort(temp);
        for(int i=0;i<heights.length;i++)
            if(heights[i]!=temp[i])
                count++;
        return count;
    }
}
