/**
 * @Author xuchuanwei
 * @Mail 1141811203@qq.com
 * @Time 2020/6/24 13:56
 * 递归算法
 **/
public class Recursive {

    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    /**
     * 求1-num的和
     * @param num
     * @return
     */
    public static int sum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sum(num - 1);
        }
    }
}
