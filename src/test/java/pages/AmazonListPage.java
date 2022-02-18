package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;

import java.util.List;

public class AmazonListPage extends  base {
    @FindBy(css = "[id='add-to-cart-button']")
    private WebElement addCardButton;

    public AmazonListPage(WebDriver driver) {
        super(driver);
    }

    public void addFirstProductToCar() {
        List<WebElement> results = this.driver.findElements(By.cssSelector(".s-image"));
        results.get(0).click();
        this.addCardButton.click();
    }

    public String getPrice() {
        return this.driver.findElement(By.cssSelector(".ewc-subtotal-amount")).getText();
    }
}