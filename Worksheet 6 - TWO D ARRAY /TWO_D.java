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
        int maxNum=M[0][0];
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
        int minNum=M[0][0];
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (minNum>M[i][j]){
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

    public void subtract(TWO_D a, TWO_D b){
        if(a.m==b.m&&a.n==b.n){
            this.m=a.m;
            this.n=a.n;
            this.M=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    this.M[i][j]+=(a.M[i][j]-b.M[i][j]);
                }
            }
        }
    }

    public void multiply(TWO_D arr){
        if (n == arr.m) {
            int[][] temp = new int[m][arr.n];
    
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < arr.n; j++) {
                    for (int k = 0; k < n; k++) {
                        temp[i][j] += M[i][k] * arr.M[k][j];
                    }
                }
            }
    
            // Assign the values from temp back to the M array
            M = temp;
            n = arr.n;
        } else {
            System.out.println("Invalid matrix dimensions for multiplication.");
        }
    }
    public static void main(String[] args) {
        // Create an object of TWO_D class
        TWO_D matrix = new TWO_D(3, 3);
      
        // Initialize the matrix
        int[][] values = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matrix.M = values;
    
        // Display the matrix
        matrix.Display();
    
        // Get the maximum number in the matrix
        int max = matrix.maxnum();
        System.out.println("Maximum number: " + max);
    
        // Get the minimum number in the matrix
        int min = matrix.minnum();
        System.out.println("Minimum number: " + min);
    
        // Search for an element in the matrix
        int searchElement = 5;
        matrix.search(searchElement);
    
        // Calculate the sum of the left-to-right diagonal
        int diagSum = matrix.diagSum();
        System.out.println("Sum of the diagonal: " + diagSum);
    
        // Check if the matrix is square
        boolean isSquare = matrix.Square();
        System.out.println("Is the matrix square? " + isSquare);
    
        // Calculate the sum of the boundary elements
        int boundarySum = matrix.sum_boundary();
        System.out.println("Sum of the boundary elements: " + boundarySum);
    
        // Calculate the sum of the non-boundary elements
        int nonBoundarySum = matrix.sum_non_boundary();
        System.out.println("Sum of the non-boundary elements: " + nonBoundarySum);
    
        // Transpose the matrix
        TWO_D transposedMatrix = matrix.trans();
        System.out.println("Transposed matrix:");
        transposedMatrix.Display();
    
        // Create a copy of the matrix
        TWO_D copiedMatrix = matrix.copy();
        System.out.println("Copied matrix:");
        copiedMatrix.Display();
    
        // Add two matrices
        TWO_D matrixA = new TWO_D(new int[][]{{1, 2}, {3, 4}});
        TWO_D matrixB = new TWO_D(new int[][]{{5, 6}, {7, 8}});
        TWO_D sumMatrix = new TWO_D();
        sumMatrix.add(matrixA, matrixB);
        System.out.println("Sum of matrices:");
        sumMatrix.Display();
    
        // Subtract two matrices
        TWO_D differenceMatrix = new TWO_D();
        differenceMatrix.subtract(matrixA, matrixB);
        System.out.println("Difference of matrices:");
        differenceMatrix.Display();
    
        // Multiply two matrices
        TWO_D matrixC = new TWO_D(new int[][]{{1, 2, 3}, {4, 5, 6}});
        TWO_D matrixD = new TWO_D(new int[][]{{7, 8}, {9, 10}, {11, 12}});
        matrixC.multiply(matrixD);
        System.out.println("Product of matrices:");
        matrixC.Display();
    }
}