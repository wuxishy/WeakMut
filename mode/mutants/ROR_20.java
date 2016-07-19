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
            if (arr[i] == cur) {
                count += 1;
            } else {
                cur = arr[i];
                count = 1;
            }
            // ------------
            int NAME0 = true ? count : max;
            int NAME1 = count > max ? count : max;
            if (NAME0 != NAME1) throw new RuntimeException();
			// ------------
			max = NAME0;
        }
        return max;
    }

}
