package components;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBox {
    private WebDriver driver;
    @FindBy(css = "[id='twotabsearchtextbox']")
    private WebElement searchBox;
    @FindBy(css = "[id='nav-search-submit-button'")
    private WebElement submitButton;

    public SearchBox(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void findProduct(String nameProduct) {
        this.searchBox.click();
        this.searchBox.sendKeys(nameProduct);
        this.submitButton.click();
    }
}
