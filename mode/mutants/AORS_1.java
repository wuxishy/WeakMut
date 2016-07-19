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
        	if(!(PREFIX_i < arr.length)) break;
        	 
            if (arr[PREFIX_i] == cur) {
                count += 1;
            } else {
                cur = arr[PREFIX_i];
                count = 1;
            }
            max = count > max ? count : max;
            
            // -------------------
            // substitute with actual value
            int NAME0 = PREFIX_i+1; 
            int NAME1 = PREFIX_i;
            if (NAME0 != NAME1) throw new RuntimeException();
            // make modification
            int COPY0 = PREFIX_i, COPY1 = PREFIX_i;
            ++COPY0; COPY1--;
            if(COPY0 != COPY1) throw new RuntimeException();
            // -------------------
			PREFIX_i = COPY0;
        }
        return max;
    }

}
