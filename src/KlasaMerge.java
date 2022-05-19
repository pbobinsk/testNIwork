public class KlasaMerge {

    private String s1;

    private String s2;

    public KlasaMerge(String s1) {
        this.s1 = s1;
    }

    public KlasaMerge(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "KlasaMerge{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }
}
