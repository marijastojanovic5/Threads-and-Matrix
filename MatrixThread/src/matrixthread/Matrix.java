package matrixthread;
public class Matrix {
    private int m,n;
    private int[][] matrix;

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        matrix=new int[m][n];
        
    }
    
    public void addValues(int num){
        for(int i=0;i<matrix.length; i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=num;
            }
        }
        
    }
    public static Matrix sumTwoMatrix(Matrix a, Matrix b){
        Matrix c=new Matrix(a.matrix.length,a.matrix[0].length);
        for(int i=0;i<c.matrix.length; i++){
            for(int j=0;j<c.matrix[i].length;j++){
                c.matrix[i][j]=a.matrix[i][j]+ b.matrix[i][j];
            }
        }
        return c;
        
    }
    public static Matrix addUsingThread(Matrix a, Matrix b){
        
        Matrix c=new Matrix(a.matrix.length,a.matrix[0].length);
        Thread1 arrayThread[]=new Thread1[a.matrix.length];
        for(int i=0; i<arrayThread.length;i++){
            arrayThread[i]=new Thread1(a,b,i);
        }
        for(int i=0; i<arrayThread.length;i++){
            try {
                arrayThread[i].join();
                c.matrix[i]=arrayThread[i].getEndingRow();
            } catch (InterruptedException ex) {
            }
        }
        return c;
    }
    
    public int[] getM(int i) {
        return matrix[i];
    }
    
    @Override
    public String toString() {
//        String s="";
//        for(int i=0;i<m;i++){
//            for (int j=0;j<n;j++)
//                s+=matrix[i][j]+" ";
//            s+="\n";
//        }
//        return s;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<matrix.length; i++){
            for(int j=0;j<matrix[i].length;j++){
                sb.append(matrix[i][j]+" ");
            }
            sb.append("\n");
        }
        return sb.toString();

    }
    
    
    
    
}
