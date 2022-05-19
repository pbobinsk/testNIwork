public class KlasaMerge {

    private double s1;


    private String s2;

    public KlasaMerge(double s1) {

        this.s1 = s1;

    }

    public KlasaMerge(double s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "KlasaMerge{" +

                "s1=" + s1 +
                ", d2=" + s2 +

                '}';
    }
}
