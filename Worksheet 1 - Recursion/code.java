import java.util.*;

public class code {

    public static void printnum(int N) {
        System.out.println(N);
        if(N!=1){
            printnum(N-1);
        }
    }

    public static void printsqcb(int N) {
        if(N==1){
            System.out.println("Number\tSquare\tCube");
        }else{
            printsqcb(N-1);
        }
        System.out.println(N+"\t"+(N*N)+"\t"+(N*N*N));
    }

    public static void multiples(int M, int N) {
        if(N!=1){
            multiples(M, N-1);
        }
        System.out.print((M*N)+" ");
    }

    public static void factors(int N, int F) {
        if(F==1){
            System.out.println("Factors of "+N+":");
        }
        if(F<=N/2){
            if(N%F==0){
                System.out.print(F+" ");
            }
            factors(N, F+1);
        }
    }
               

    public static void commonfactors(int M, int N, int F) {
        if(F==2){
            System.out.println("Common factors of " + M + " and " + N + ": ");
        }
        if(F<=M/2&&F<N/2){
            if(M%F==0 && N%F==0){
                System.out.println(F+" ");
            }
            commonfactors(M, N, F+1);
        }
    }

    public static void fiboseries(int N, int x, int y) {
        System.out.print(x + " "); 
        fiboseries(N - 1, y, x + y);
    }

    public static int countdigits(int N) {
        if(N!=0){
            return 1+countdigits(N/10);
        }else{
            return 0;
        }
    }

    public static int largest(int N, int v) {
        if(N<=0){
            return v;
        }else{
            if(N%10>v&&N!=0){
                return largest(N/10, N%10);
            }else{
                return largest(N/10, v);
            }
        }
    }

    public static int smallest(int N, int v) {
        if(N<=0){
            return v;
        }else{
            if(N%10<v&&N!=0){
                return smallest(N/10, N%10);
            }else{
                return smallest(N/10, v);
            }
        }
    }

    public static int prod_digits(int N) {
        if(N!=0){
            return (N%10)*prod_digits(N/10);
        }else{
            return 1;
        }
    }

    public static void tables(int N, int T) {
        if(T==1){
            System.out.println("Multiplication Table:");
        }
        if(T!=0){
            tables(N, T-1);
            System.out.println(N+"x"+T+"="+(N*T));
        }
    }

    public static void reverse_order(int N) {
        if(!(N<=0)){
            System.out.print(N%10);
            reverse_order(N/10);
        }else{
            System.out.println();
        }
    }

    public static boolean Armstrong_3digit(int N, int sum, int cp) {
        if(N>0){
            return Armstrong_3digit(N/10, sum+((N%10)*(N%10)*(N%10)), cp);
        }else{
            return sum==cp;
        }
    }

    public static void numpattern1(int N) {
        if(N>0){
            System.out.println(N);
            numpattern1(N/10);
        }
    }

    public static void numpattern2(int N) {
        if(N>0){
            numpattern1(N/10);
            System.out.println(N);
        }
    }

    public static boolean Duck(int N) {
        if(N>0){
            return (N%10==0)?true:Duck(N/10);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();
        scanner.close();
        // Test functions
        printnum(N);
        System.out.println();
        printsqcb(N);
        System.out.println();
        multiples(5, N);
        System.out.println("\n");
        factors(N, 1);
        System.out.println("\n");
        commonfactors(36, 48, 2);
        System.out.println("\n");
        //fiboseries(N, -1, 1);
        System.out.println("Number of digits: " + countdigits(N));
        System.out.println("\n");
        System.out.println("Largest digit: " + largest(N, 0));
        System.out.println("\n");
        System.out.println("Smallest digit: " + smallest(N, 9));
        System.out.println("\n");
        System.out.println("Product of digits: " + prod_digits(N));
        System.out.println("\n");
        tables(N, N);
        System.out.println("\n");
        reverse_order(N);
        System.out.println("\n");
        System.out.println("Armstrong number? " + Armstrong_3digit(N, 0, N));
        System.out.println("\n");
        numpattern1(N);
        System.out.println("\n");
        numpattern2(N);
        System.out.println("\n");
        System.out.println("Is Duck number? " + Duck(N));
    }
}