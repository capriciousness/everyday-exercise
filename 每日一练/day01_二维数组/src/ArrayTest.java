import java.util.Scanner;

/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class ArrayTest {
    public static void main(String[] args) {
        int[][] arrs = new int[3][];

        for (int i = 0; i < arrs.length; i++) {
            System.out.println("请输入:");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();  //一次输入一个一维数组，空格隔开，回车结束
            String s =null;
            int j_max = str.split(" ").length;
            arrs[i] = new int[j_max];
            for (int j = 0; j<j_max; j++) {
                if((s=str.split(" ")[j])!=null) {
                    //接收每一个整数
                    arrs[i][j] = Integer.parseInt(s.trim());
                    System.out.println(arrs[i][j]);

                }
                else{
                    System.out.println("切割失败!");
                    break;
                }
            }

        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = find(num,arrs);
        if(flag)
            System.out.println("有");
            //System.out.println("git");
    }

    private static boolean find(int num,int[][] arrs) {
        boolean flag = false;
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j <arrs[i].length ; j++) {
                if (num == arrs[i][j]) {
                    flag = true;
                    return flag;
                }
            }
        }
        return flag;
    }

}
