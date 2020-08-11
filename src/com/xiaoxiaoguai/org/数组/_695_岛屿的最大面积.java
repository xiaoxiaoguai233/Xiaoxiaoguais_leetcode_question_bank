package com.xiaoxiaoguai.org.数组;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-12 4:22 上午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * @UsingIDEA IntelliJ IDEA
 */

public class _695_岛屿的最大面积 {

    public static void main(String[] args) {
        int[][] array = {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        System.out.println(maxAreaOfIsland(array));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    max = Math.max(dfs(grid, i, j), max);
                }
            }
        }
        return max;
    }

    /* 标准DFS深度优先搜索, 思路: 从1个每个岛屿开始搜索,  */
    /* 寻找连在一起的岛屿, 更新最大值, 并标记访问过的岛屿  */
    /* 求所有岛屿中的最大值  */
    static int dfs(int[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;
        int count = 1;
        count += dfs(grid, i+1, j);
        count += dfs(grid, i-1, j);
        count += dfs(grid, i, j+1);
        count += dfs(grid, i, j-1);
        return count;
    }
}
