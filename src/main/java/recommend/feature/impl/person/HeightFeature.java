package recommend.feature.impl.person;

import recommend.feature.Feature;
import recommend.math.Normalize;

/**
 * Created by kenny on 2/13/14.
 */
public class HeightFeature extends Feature {

    private static final double MAX_VALUE = 84;

    private static final double MIN_VALUE = 60;

    public HeightFeature(double value) {
        super("HEIGHT", value);
    }

    @Override
    public double normalize() {
        return Normalize.linear(getOriginalValue(), MIN_VALUE, MAX_VALUE);
    }

    @Override
    public String toString() {
        return "HeightFeature{" +
                "value=" + getOriginalValue() + " inches" +
                '}';
    }

}
