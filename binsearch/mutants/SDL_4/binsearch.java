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
            if (num > arr[mi]) {
            } else {
                hi = mi;
            }
        }
        return lo;
    }

}
