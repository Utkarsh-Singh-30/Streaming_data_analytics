package Project.StreamingAnalyticsPlatform;

import java.util.Random;

public class RandomDataGenerator {
    private final double min;
    private final double max;
    private final Random random;

    public RandomDataGenerator(double min, double max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

//    For generating random values....
    public double generate() {
        double val=random.nextDouble(min, max);
        return Math.round(val*100.0)/100.0;
    }
}
