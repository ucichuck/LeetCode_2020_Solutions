// Counting sort algorithm : https://www.geeksforgeeks.org/counting-sort/
public class CountSort {
    public void countSort(int[] arr, int start, int end) {
        int[] count = new int[end - start + 1];
        for (int value : arr) {
            count[value - start] += 1;
        }

        for (int i = start + 1; i <= end; i++) {
            count[i - start] += count[i - start - 1];
        }

        int[] tmp = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            tmp[count[arr[i] - start] - 1] = arr[i];
            count[arr[i] - start] -= 1;
        }

        System.arraycopy(tmp, 0, arr, 0, arr.length);
    }
}
