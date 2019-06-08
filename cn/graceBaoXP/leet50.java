package cn.graceBaoXP;

/**
 * Pow(x, n)
 *
 * Implement pow(x, n), which calculates x raised to the power n (xn).
 *
 */
public class leet50 {

    public double myPow(double x, int n) {
        if(n>=0){
            return help(x,n);
        }else{
            return  1/help(x,-n);
        }
    }

    public double help(double x,int n){
        if(n==0){
            return 1;
        }
        double half=help(x,n/2);
        if(n%2==0){
            return half *=half;
        }else{
            return half * half * x;
        }
    }
}
