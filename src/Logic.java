import java.util.ArrayList;

public class Logic {
    private Otomat otomat;

    public Logic() {
        this.otomat = new Otomat(100, 0.2);
    }

    public void makeMove() {
        ArrayList<Cell> nabers;
        for (int i=0; i<100; i++) {
            for (int j=0; j<100; j++) {
                nabers = this.otomat.getNabers(i,j);
                //TODO
                //check function
            }
        }
    }
}
