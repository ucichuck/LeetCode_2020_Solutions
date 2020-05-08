// Radix sort algorithm  https://www.geeksforgeeks.org/radix-sort/
public class RadixSort {
    public void radixSort (int[] arr) {

        int div = 1;
        int max = getMax(arr);
        while (max/div > 0) {
            countingSort(arr, div);
            div = div*10;
        }
    }

    private void countingSort(int[] arr, int div) {
        int[] count = new int[10];
        for (int value : arr) {
            count[(value/div) % 10] += 1;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] tmp = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            tmp[count[(arr[i]/div)%10] - 1] = arr[i];
            count[(arr[i]/div)%10] -= 1;
        }

        System.arraycopy(tmp, 0, arr, 0, arr.length);
    }

    private int getMax(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res = Math.max(res, i);
        }
        return res;
    }
}
