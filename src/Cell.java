import java.awt.*;

public class Cell {
    private State state;

    private double Gprob;
    private double Fprob;
    private double Pprob;


    public Cell(State state, double Gprob, double Fprob, double Pprob) {
        this.state = state;

        this.Gprob = Gprob;
        this.Fprob = Fprob;
        this.Pprob = Pprob;
    }


    public State getState() {
        return state;
    }


    public void setState(State state) {
        this.state = state;
    }

    public double getProb(String prob) {
        switch (prob) {
            case "G" :
                return this.Gprob;
            case "F":
                return this.Fprob;
            case "P":
                return this.Pprob;
            default:
                return 0.5;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
