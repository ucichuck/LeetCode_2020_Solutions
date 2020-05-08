public class QuickSort {
    public  void  quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int left, int right) {
       if (left < right) {
           int part = partition(arr, left, right);
           quickSort(arr, left, part-1);
           quickSort(arr, part+1, right);
       }
    }

    private int partition(int[] arr, int left, int right) {
        int res = left - 1;
        int pivot = arr[right];

        for (int i = left; i < right; i++ ) {
            if (arr[i] < pivot) {
                res++;
                int tmp = arr[i];
                arr[i] = arr[res];
                arr[res] = tmp;
            }
        }
        res++;
        int tmp = arr[right];
        arr[right] = arr[res];
        arr[res] = tmp;
        return res;
    }
}
