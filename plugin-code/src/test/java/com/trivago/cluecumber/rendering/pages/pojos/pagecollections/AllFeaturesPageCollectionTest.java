package com.trivago.cluecumber.rendering.pages.pojos.pagecollections;

import com.trivago.cluecumber.json.pojo.Report;
import com.trivago.cluecumber.rendering.pages.pojos.Feature;
import com.trivago.cluecumber.rendering.pages.pojos.ResultCount;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AllFeaturesPageCollectionTest {

    @Test
    public void getEmptyTagStatsTest() {
        List<Report> reports = new ArrayList<>();
        AllFeaturesPageCollection allFeaturesPageCollection = new AllFeaturesPageCollection(reports);
        Map<Feature, ResultCount> featureStats = allFeaturesPageCollection.getFeatureResultCounts();
        assertThat(featureStats.size(), is(0));
    }
}
