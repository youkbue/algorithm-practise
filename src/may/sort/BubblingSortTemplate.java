package may.sort;

/**
 * <p> 冒泡排序模板 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/19 13:52
 */
public class BubblingSortTemplate {

    public void bubbleSort(int[] arr) {
        int length = arr.length;
        for(int i = 0 ; i< length - 1 ; i++){
            for(int j = 0 ; j< length - 1 -i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        new BubblingSortTemplate().bubbleSort(arr);
        System.out.println("排序后的数组：");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
