import java.io.*;
import java.util.*;

public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + "  ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0)
                return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        // 保留字符串
        String[] alphacoords = new String[comSize];
        // 临时字符串
        String temp = null;
        // 现有字符串
        int[] coords = new int[comSize];
        // 目前测试的字符串
        int attempts = 0;
        // 找到合适位置吗？
        boolean success = false;
        // 目前起点
        int location = 0;

        // 现在处理到第n个
        comCount++;
        // 水平增量
        int incr = 1;
        // 如果是单数号的
        if ((comCount % 2) == 1) {
            // 垂直增量
            incr = gridLength;
        }

        // 主要搜索循环
        while (!success & attempts++ < 200) {
            // 随机起点
            location = (int) (Math.random() * gridSize);
            // System.out.print(" try " + location);
            // 第n个位置
            int x = 0;
            // 假定成功
            success = true;
            // 查找未使用的点
            while (success && x < comSize) {
                // 如果没有使用
                if (grid[location] == 0) {
                    // 储存位置
                    coords[x++] = location;
                    // 尝试下一个点
                    location += incr;
                    // 超出下边缘
                    if (location >= gridSize) {
                        // 失败
                        success = false;
                    }
                    // 超出右边缘
                    if (x > 0 && (location % gridLength == 0)) {
                        // 失败
                        success = false;
                    }
                } else {
                    // 找到已经使用的位置
                    // System.out.print(" used " + location);
                    // 失败
                    success = false;
                }
            }
        }

        // 将位置转换成字符串形式
        int x = 0;
        int row = 0;
        int column = 0;
        // System.out.println("\n");
        while (x < comSize) {
            // 标识格子已用
            grid[coords[x]] = 1;
            // 得到行的值
            row = (int) (coords[x] / gridLength);
            // 得到列的值
            column = coords[x] % gridLength;
            // 转换成字符串
            temp = String.valueOf(alphabet.charAt(column));

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            // 这一行会告诉你DotCOm的确实位置
            // System.out.print(" coords " + x + " = " + alphaCells.get(x-1));
        }
        // System.out.println("\n");

        return alphaCells;
    }
}