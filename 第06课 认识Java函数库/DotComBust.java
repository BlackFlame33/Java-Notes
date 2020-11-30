import java.util.*;

public class DotComBust {
    // 声明并初始化变量
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        // 创建3个DotCom对象并指派名称并置入ArrayList
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        // 列出简短的提示
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        // 对list中所有的DotCom重复
        for (DotCom dotComToSet : dotComsList) {
            // 要求DotCom的位置
            ArrayList<String> newLocation = helper.placeDotCom(3);
            // 调用这个DotCom的setter方法来指派刚取得的位置
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        // 判断DotCom的list是否为空
        while (!dotComsList.isEmpty()) {
            // 取得玩家输入
            String userGuess = helper.getUserInput("Enter a guess: ");
            // 调用checkUserGuess方法
            checkUserGuess(userGuess);
        }
        // 调用finishGame方法
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        // 递增玩家猜测次数的计数
        numOfGuesses++;
        // 先假设没有命中
        String result = "miss";
        // 对list中所有的DotCom重复
        for (DotCom dotComToTest : dotComsList) {
            // 要求DotCom检查是否命中或击沉
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                // 提前跳出循环
                break;
            }
            if (result.equals("kill")) {
                // 这家伙被挂掉了
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        // 列出结果
        System.out.println(result);
    }

    private void finishGame() {
        // 列出玩家成绩
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your option sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }

    public static void main(String[] args) {
        // 创建游戏对象
        DotComBust game = new DotComBust();
        // 要求游戏对象启动
        game.setUpGame();
        game.startPlaying();// 要求游戏对象启动游戏的主要循环
    }
}