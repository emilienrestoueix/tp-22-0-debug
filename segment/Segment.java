package segment;

public class Segment {


    private int extr2;

    private int extr1 = extr2;

    public Segment(int extr2, int extr1) {
        this.extr2 = extr2;
        this.extr1 = extr1;
    }

    public int getExtr2() {
        return extr2;
    }

    public void setExtr2(int extr2) {
        this.extr2 = extr2;
    }

    public int getExtr1() {
        return extr1;
    }

    public void setExtr1(int extr1) {
        this.extr1 = extr1;
    }

    public int segmentLength(int extr1, int extr2) {
        return Math.abs(extr2 - extr1);
    }

    public boolean appartient(int x) {
        return x > extr1 && x < extr2;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "extr2=" + extr2 +
                ", extr1=" + extr1 +
                '}';
    }
}
