// This is a mutant program.
// Author : ysma

import java.util.Arrays;


public class mode
{

    public  int run( int[] arr )
    {
        Arrays.sort( arr );
        int max = 1;
        int cur = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; ++i) {
        	// ---------------
        	boolean NAME0 = arr[i] == cur;
        	boolean NAME1 = arr[i] == ~cur;
        	if (NAME0 != NAME1) throw new RuntimeException();
        	// ---------------
            if (NAME0) {
                count += 1;
            } else {
                cur = arr[i];
                count = 1;
            }
            max = count > max ? count : max;
        }
        return max;
    }

}
