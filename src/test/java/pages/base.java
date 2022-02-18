package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class base extends PageFactory {
    protected WebDriver driver;

    public base (WebDriver driver) {
        this.driver = driver;
        this.initElements(driver, this);
    }
}
