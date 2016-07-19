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
				// ------------
				int NAME0 = i;
				int NAME1 = -i;
				if (NAME0 != NAME1) throw new RuntimeException();
				// ------------
                cur = arr[NAME0];
                count = 1;
            }
            max = count > max ? count : max;
        }
        return max;
    }

}
