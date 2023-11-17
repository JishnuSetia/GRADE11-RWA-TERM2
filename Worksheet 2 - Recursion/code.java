import java.util.*;
public class code {
    public static int sum(int N){
        return N>0?N+sum(N-1):0;
    }
    public static long power(int x, int y){
        return y>0?x*power(x, y-1):1;
    }
    public static int factorial(int x){
        return x>0?x*factorial(x-1):1;
    }
    public static int sumFactors(int x, int f){
        return f<=x?(x%f==0?f:0)+sumFactors(x, f+1):0;
    }
    public static boolean prime(int x, int n){
        return x%n==0&&x!=n?false:n<x/2?prime(x, n+1):true;
    }
    public static int sumDigits(int n){
        return n!=0?Integer.parseInt(Character.toString(Integer.toString(n).charAt(Integer.toString(n).length()-1)))+sumDigits(Integer.parseInt(Integer.toString(n).substring(0, Integer.toString(n).length()-1)!=""?Integer.toString(n).substring(0, Integer.toString(n).length()-1):"0")):0;
    }
    public static int hcf(int x, int y){
        return y==0?x:hcf(y, x%y);
    }
    public static int lcm(int x, int y, int k){
        return k%x==0&&k%y==0?k:lcm(x, y, k+1);
    }
    public static int krish(int n){
        return n>0?factorial(Integer.parseInt(Character.toString(Integer.toString(n).charAt(Integer.toString(n).length()-1))))+krish(Integer.parseInt(Integer.toString(n).substring(0, Integer.toString(n).length()-1)!=""?Integer.toString(n).substring(0, Integer.toString(n).length()-1):"0")):0;
    }
    public static int fibo(int n){
        return n>2?fibo(n-1)+fibo(n-2):n==1?0:n==2?1:0;
    }
    public static void primeFactors(int n, int f){
        if (n > 1) {
            if (n % f == 0) {
                System.out.print(f + " ");
                primeFactors(n / f, f);
            } else {
                primeFactors(n, f + 1);
            }
        }else{
            System.out.println();
        }
    }
    public static int reverse(int n){
        return n>=10?(Integer.parseInt(Character.toString(Integer.toString(n).charAt(Integer.toString(n).length()-1))+Integer.toString(reverse(n/10)))):n;
    }
}
