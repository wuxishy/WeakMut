// This is a mutant program.
// Author : ysma

import java.lang.Math;


public class loc
{

    public  int calc( double a, double b, double c )
    {
        if (a < 0 || b < 0 || c < 0) {
            return -1;
        } else {
            if (a + b < c || c < b || b + c < a) {
                return -1;
            } else {
                double tmp = Math.pow( a, 2 ) + Math.pow( b, 2 ) - Math.pow( c, 2 );
                double cos = tmp / (2 * a * b);
                return (int) (Math.acos( cos ) / Math.PI * 180 + 0.5);
            }
        }
    }

}
