public class Problem {
    String description;
    int n;
    boolean weighted;
    boolean negativeWeight;

    public Problem(String description, int n, boolean weighted, boolean negativeWeight) {
        this.description = description.toLowerCase();
        this.n = n;
        this.weighted = weighted;
        this.negativeWeight = negativeWeight;
    }
}
