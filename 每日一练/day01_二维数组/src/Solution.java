import java.util.Scanner;

/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class Solution {
    public static void main(String[] args) {
        int[][] array = new int[3][];  //定义一个二维数组，给定行数

        for (int i = 0; i < array.length; i++) {
            System.out.println("请输入:");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();  //一次输入一个一维数组，空格隔开，回车结束
            String s =null;
            int j_max = str.split(" ").length;
            array[i] = new int[j_max];
            for (int j = 0; j<j_max; j++) {
                if((s=str.split(" ")[j])!=null) {
                    //接收每一个整数
                    array[i][j] = Integer.parseInt(s.trim());

                }
                else{
                    System.out.println("切割失败!");
                    break;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        boolean flag = Find(target,array);
        if(flag)
            System.out.println("包含该数");
    }

    public static boolean Find(int target, int [][] array) {
        boolean flag = false; //初始化flag为false，即：不存在该整数
        //遍历数组寻找是否存在该整数
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (target == array[i][j]) { //判断是否存在该整数
                    flag = true;  //存在
                    return flag;
                }
            }
        }
        return flag;  //不存在，返回false

    }
}