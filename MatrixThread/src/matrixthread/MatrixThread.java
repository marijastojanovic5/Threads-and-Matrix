package matrixthread;
public class MatrixThread {

    public static void main(String[] args) {
        
        Matrix mat=new Matrix(3,4);
        Matrix mat2=new Matrix(3,4);
        mat.addValues(4);
        mat2.addValues(4);
        System.out.println(Matrix.sumTwoMatrix(mat, mat2));
        
        Matrix m4=Matrix.addUsingThread(mat, mat2);
        System.out.println(m4);
    }
    
}
