import java.util.ArrayList;
import java.util.Arrays;

public class IntersactionAmongThreeArrays {
    public ArrayList<Integer> findIntersaction (int[] a, int[] b, int[] c) {
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        int ain = 0;
        int bin = 0;
        int cin = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while (ain < a.length && bin < b.length && cin < c.length) {
            if (a[ain] == b[bin] && b[bin] == c[cin]) {
                res.add(a[ain]);
                ain++;
                bin++;
                cin++;
            } else {
                int pivot = Math.min(Math.min(a[ain], b[bin]), c[cin]);

                if (pivot == a[ain]) {
                    ain++;
                } else if (pivot == b[bin]) {
                    bin++;
                } else {
                    cin++;
                }
            }
        }
        return res;
    }
}
