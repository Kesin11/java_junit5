package tddbc;

public class ClosedRange {
    public int lower;
    public int higher;
    public ClosedRange(int lower, int higher) {
        this.lower = lower;
        this.higher = higher;
    }

    public boolean include(int point) {
        return this.lower <= point && point <= this.higher;
    }

    public boolean include(int lower, int higher) {
        return this.lower <= lower && higher <= this.higher;
    }

}

