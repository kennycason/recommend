package recommend.math;

import recommend.feature.GeneralFeature;
import recommend.feature.Item;
import recommend.feature.Feature;

/**
 * Created by kenny on 2/20/14.
 */
public class Stats {

    private Stats() {}

    public static Item average(Item item1, Item item2) {
        Item averaged = new Item("{" + item1.getName() + "," + item2.getName() + "}");
        for(String featureName : item1.intersection(item2)) {
            Feature feature1 = item1.getFeature(featureName);
            Feature feature2 = item2.getFeature(featureName);
            averaged.addFeature(new GeneralFeature(featureName, (feature1.getValue() + feature2.getValue()) / 2.0));
        }
        return averaged;
    }

}
