import java.util.*;
public class PossibleNumberCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int n=sc.nextInt();
        sc.close();
        int ctr=1;
        while (ctr<n){
            int sum = 0;
            int num = ctr;
            for(;num<n;num++){
                sum+=num;
                if(sum==n){
                    for(int i=ctr;i<=num;i++){
                        System.out.print(i+" ");
                    }
                    System.out.println();
                    break;
                }
            }
            ctr++;
        }
    }
}