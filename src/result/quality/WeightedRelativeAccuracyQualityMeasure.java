package result.quality;

/**
 * The weighted relative accuracy function, found on page 49 in:
 *
 * J. Fürnkranz, P.A. Flach
 * ROC 'n' Rule Learning - Towards a Better Understanding of Covering Algorithms, Machine Learning 58(1):39{77, 2005.
 */
public class WeightedRelativeAccuracyQualityMeasure extends AbstractQualityMeasure {
    /**
     * Evaluate the given confusion table.
     *
     * @param p The p value in the confusion table.
     * @param n The n value in the confusion table.
     * @param P The P value in the confusion table.
     * @param N The N value in the confusion table.
     * @return The result calculated by the heuristic.
     */
    @Override
    public double evaluate(double p, double n, double P, double N) {
        return ((p + n) / (P + N)) * (p / (p + n) - P / (P + N));
    }
}