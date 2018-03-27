import java.util.ArrayList;
import java.util.Random;

public class Otomat {
    private int size;
    private Cell[][] matrix;
    private double probability;

    public Otomat(int size, double probability) {
        this.size = size;
        this.matrix = new Cell[size][size];
        this.probability = probability;
    }

    public void InitialOtomat() {
        Random rnd = new Random();
        int prob;
        for (int i=0; i<100; i++) {
            for (int j=0; j<100; j++) {
                prob = rnd.nextInt(100);
                if (prob <= this.probability*100) {
                    this.matrix[i][j] = new Cell(State.TREE, 0.2, 0.3, 0.6);
                }
                else {
                    this.matrix[i][j] = new Cell(State.EMPTE, 0.2, 0.3, 0.6);
                }
            }
        }
    }

    public ArrayList<Cell> getNabers(int i, int j) {
        ArrayList nabers = new ArrayList<Cell>();
        nabers.add(this.matrix[i][j+1]);
        nabers.add(this.matrix[i+1][j]);
        nabers.add(this.matrix[i][j-1]);
        nabers.add(this.matrix[i-1][j]);
        return nabers;
    }
}
