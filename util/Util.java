package util;

public class Util {

    public static int ackerman(int m, int n){
        if (m > 0 && n > 0) {
            return ackerman(m-1, ackerman(m,n-1));
        }

        if (m == 0){
            return n+1;
        }

        if (n == 0){
            return ackerman(m-1,1);
        }
        return 0;
    }
}
