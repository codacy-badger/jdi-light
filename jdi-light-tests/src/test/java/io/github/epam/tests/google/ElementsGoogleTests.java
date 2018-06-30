package io.github.epam.tests.google;

import com.epam.jdi.tools.map.MapArray;
import com.google.custom.SearchResult;
import io.github.epam.GoogleInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.jdi.tools.map.MapArray.map;
import static com.epam.jdi.tools.pairs.Pair.$;
import static com.google.GoogleSite.homePage;
import static com.google.GoogleSite.searchPage;

/**
 * Created by Roman_Iovlev on 3/2/2018.
 */
public class ElementsGoogleTests extends GoogleInit {
    @Test
    public void resultsAsList() {
        Assert.assertTrue(homePage.getDriver().getCurrentUrl()
            .contains( "https://www.google."));
        homePage.search("jdi");
        for (SearchResult job : searchPage.jobsE)
            System.out.println(job.print());
    }
}
