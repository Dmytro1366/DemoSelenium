package clickOn;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.HOTLINE_HOME_PAGE;

public class ClickOn extends BaseTest {
    @Test
    public void checkIsRedirectToListing() {
        basePage.open(HOTLINE_HOME_PAGE);
        hotlineHomePage.selectModule();

    }
}
