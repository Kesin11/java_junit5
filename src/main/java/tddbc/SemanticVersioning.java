package tddbc;

public class SemanticVersioning {
    private int major;
    private int minor;
    private int patch;

    public SemanticVersioning (int major, int minor, int patch) {
        this.major = major;
        this.minor = minor;
        this.patch = patch;
    }

    public String toString() {
        return String.format("%d.%d.%d", major, minor, patch);
    }
}