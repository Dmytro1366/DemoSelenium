package pages.hotline_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class HotlineHomePage extends BasePage {
    public HotlineHomePage(WebDriver driver) {
        super(driver);
    }

    private final By search = By.cssSelector("[data-menu-main-item='Дитячі товари'] .menu-main-link");

    public HotlineHomePage selectModule() {
        driver.findElement(search).click();
        return this;
    }
}
