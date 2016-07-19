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
        
        int PREFIX_i = 1;
        while (true) {
        	// ----------------
        	boolean NAME0 = PREFIX_i < arr.length;
        	boolean NAME1 = !(PREFIX_i < arr.length);
        	if (NAME0 != NAME1) throw new RuntimeException();
        	// ----------------
        	if (!NAME0) break;
        	
            if (arr[PREFIX_i] == cur) {
                count += 1;
            } else {
                cur = arr[PREFIX_i];
                count = 1;
            }
            max = count > max ? count : max;
            
            ++PREFIX_i;
        }
        return max;
    }

}
