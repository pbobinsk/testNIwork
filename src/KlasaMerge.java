public class KlasaMerge {

    private double s1;

    private double d2;

    public KlasaMerge(double s1) {
        this.s1 = s1;
    }

    public KlasaMerge(double s1, double d2) {
        this.s1 = s1;
        this.d2 = d2;
    }

    @Override
    public String toString() {
        return "KlasaMerge{" +
                "s1=" + s1 +
                ", d2=" + d2 +
                '}';
    }
}
