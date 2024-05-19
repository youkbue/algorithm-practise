package may.sort;

/**
 * <p> 快速排序模板 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/19 14:06
 */
public class QuickSortTemplate {
    public void quickSort(int[] q, int l, int r) {
        if(l >= r) return;
        int x = q[l];
        int i = l -1 , j = r + 1;
        while(i < j) {
            do i++; while (q[i] < x);
            do j--; while (q[j] > x);
            if(i < j ){
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        quickSort(q, l ,j);
        quickSort(q, j + 1, r);
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        new QuickSortTemplate().quickSort(arr,0 , arr.length - 1);
        System.out.println("排序后的数组：");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
