// This is a mutant program.
// Author : ysma

public class binsearch
{

    public  int run( int[] arr, int num )
    {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo < hi) {
            int mi = (hi - lo) / 2 + lo;
            
            // ----------
            boolean NAME0 = num > arr[mi];
            boolean NAME1 = !(num > arr[mi]);
            if(NAME0 != NAME1) throw new WeakMutationException();
            // ----------
            if (NAME0) {
                lo = mi + 1;
            } else {
                hi = mi;
            }
        }
        return lo;
    }

}
