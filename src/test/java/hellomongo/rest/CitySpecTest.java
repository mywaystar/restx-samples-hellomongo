package hellomongo.rest;

import hellomongo.AppServer;
import org.junit.ClassRule;
import org.junit.Test;
import restx.tests.RestxSpecRule;

public class CitySpecTest {

    @ClassRule
    public static RestxSpecRule rule = new RestxSpecRule(
            AppServer.WEB_INF_LOCATION,
            AppServer.WEB_APP_LOCATION);

    @Test
    public void should_find_all_cities() throws Exception {
        rule.runTest("specs/city/should_find_all_cities.spec.yaml");
    }
}
