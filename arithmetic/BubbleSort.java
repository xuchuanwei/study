/**
 * @Author xuchuanwei
 * @Mail 1141811203@qq.com
 * @Time 2020/6/24 13:41
 * 冒泡排序算法
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 6, 3};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
