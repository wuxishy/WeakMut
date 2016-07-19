// This is a mutant program.
// Author : ysma

public class binsearch
{

    public  int run( int[] arr, int num )
    {
        int lo = 0;
        // -----------------
        int NAME0 = arr.length - 1;
        int NAME1 = ~arr.length - 1;
        if (NAME0 != NAME1) throw new WeakMutationException();
        // -----------------
        int hi = NAME0;

        while (lo < hi) {
            int mi = (hi - lo) / 2 + lo;
            if (num > arr[mi]) {
                lo = mi + 1;
            } else {
                hi = mi;
            }
        }
        return lo;
    }

}
