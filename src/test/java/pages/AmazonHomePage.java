package pages;

import components.SearchBox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
    private WebDriver driver;
    private SearchBox searchBox;

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
        this.searchBox = new SearchBox(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        this.driver.navigate().to("https://www.amazon.com");
        this.driver.manage().window().maximize();
    }

    public void findProduct(String nameProduct) {
        this.searchBox.findProduct(nameProduct);
    }
}