import java.util.*;
public class TWO_D{
    int[][] M;
    int m;
    int n;
    public TWO_D(){
        M=null;
        m=0;
        n=0;
    }
    public TWO_D(int r, int c){
        m=r;
        n=c;
        M = new int [m][n];
    }
    public TWO_D(int[][] K){
        m = K.length;
        n = K[0].length;
        M = new int [m][n];
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++){
                M[i][j] = K[i][j];
            }
        }
    }
    public void Display(){
        System.out.println("Matrix:");
        if (M != null) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(M[i][j]+" ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Empty Matrix!");
        }
    }
    public int maxnum(){
        int maxNum=0;
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (maxNum<M[i][j]){
                    maxNum=M[i][j];
                }
            }
        }
        return maxNum;
    }
    public int minnum(){
        int minNum=999999999;
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (minNum<M[i][j]){
                    minNum=M[i][j];
                }
            }
        }
        return minNum;
    }
    public void search(int x){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(x==M[i][j]){
                    System.out.println("Element "+x+" found at row="+i+" and column="+j);
                }
            }
        }
    }
    public int sumlrdiag(){
        int a=0;
        int sum=0;
        if(m==n){
            for(int k=0;k<m;k++){
                sum+=M[k][a];
                a++;
            }
        }
        return sum;
    }
    public int sumrldiag(){
        int a=n-1;
        int sum=0;
        if(m==n){
            for(int k=0;k<m;k++){
                sum+=M[k][a];
                a--;
            }
        }
        return sum;
    }
    public int diagSum(){
        if(m%2!=0){
            return sumlrdiag()+sumrldiag()-M[m/2][n/2];
        }
        else{
            return sumlrdiag()+sumrldiag();
        }
    }
    public boolean Square(){
        return m==n;
    }
    public int sum_boundary(){
        int sum=0;
        for(int i=0;i<n;i++) {
            sum += M[0][i] + M[m - 1][i]; //top and bottom boundary elements
        }
        for (int i = 0; i < m; i++) {
            sum += M[i][0] + M[i][n - 1]; //left and right boundary elements
        }
        return sum;
    }
    public int sum_non_boundary(){
        int sum=0;
        for(int i=1;i<m-1;i++) {
            for(int j=1;j<n-1;j++) {
                sum+=M[i][j];
            }
        }
        return sum;
    }

    public TWO_D trans(){
        TWO_D T=new TWO_D(n,m);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                T.M[j][i]=M[i][j];
            }
        }
        return T;
    }

    public boolean equals(TWO_D a){
        if(a.m==m&&a.n==n){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(this.M[i][j]!=a.M[i][j]){
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    public TWO_D copy(){
        TWO_D a = new TWO_D(M);
        return a;
    }

    public void add(TWO_D a, TWO_D b){
        if(a.m==b.m&&a.n==b.n){
            this.m=a.m;
            this.n=a.n;
            this.M=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    this.M[i][j]+=(a.M[i][j]+b.M[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        TWO_D td = new TWO_D(a);
        td.Display();
        td.maxnum();
        td.minnum();
        td.search(4);
        System.out.println(td.sumlrdiag());
        System.out.println(td.sumrldiag());
        System.out.println(td.diagSum());

    }
}