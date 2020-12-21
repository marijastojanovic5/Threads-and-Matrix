 
package matrixthread;
public class Thread1 extends Thread {
    
    int []endingRow;
    private Matrix a,b;
    private int row;

    public Thread1(Matrix a, Matrix b, int row) {
        this.a=a;
        this.b=b;
        this.row=row;
        endingRow=new int[a.getM(0).length];
        start();
    }

    @Override
    public void run(){
        for(int i=0;i<endingRow.length;i++){
            endingRow[i]=a.getM(row)[i]+b.getM(row)[i];
            
        }
    }
    public int[] getEndingRow() {
        return endingRow;
    }
    
    
}
