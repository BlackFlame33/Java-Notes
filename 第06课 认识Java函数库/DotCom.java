import java.util.*;

public class DotCom {
    // DotCom的实例变量
    private ArrayList<String> locationCells;// 保存位置的ArrayList
    private String name;// DotCom的名称
    // private int numOfHits;
    // 不需要上面这一行了！

    // 更新DotCom位置的setter方法
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    // 基本的setter方法
    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        // 使用到indexOf方法！如果玩家猜中的话，这个方法会返回它的位置。如果没有的话会返回-1
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            // 删除被猜中的元素
            locationCells.remove(index);
            // 用这个方法来判断是否击沉
            if (locationCells.isEmpty()) {
                result = "kill";
                // 列出击沉的信息
                System.out.println("Ouch! You sunk " + name + "  :( ");
            } else {
                result = "hit";
            } // close if
        } // close outer if
        return result;
    }// close method
}// close class