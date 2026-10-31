import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;

class Solution {
    public int minimumLines(int[][] stockPrices) {
        int n = stockPrices.length;
        if (n <= 1) return 0;

        Arrays.sort(stockPrices, (a, b) -> Integer.compare(a[0], b[0]));

        int lines = 1;
        BigDecimal prevSlope = getSlope(stockPrices[0], stockPrices[1]);

        for (int i = 2; i < n; i++) {
            BigDecimal currentSlope = getSlope(stockPrices[i - 1], stockPrices[i]);
            if (!currentSlope.equals(prevSlope)) {
                lines++;
                prevSlope = currentSlope;
            }
        }

        return lines;
    }

    private BigDecimal getSlope(int[] p1, int[] p2) {
        BigDecimal dy = BigDecimal.valueOf((long) p2[1] - p1[1]);
        BigDecimal dx = BigDecimal.valueOf((long) p2[0] - p1[0]);
        // Divide with 128-bit precision context
        return dy.divide(dx, MathContext.DECIMAL128);
    }
}