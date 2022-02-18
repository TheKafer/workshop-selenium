package pages;

import components.SearchBox;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage extends base {
    private SearchBox searchBox;

    public AmazonHomePage(WebDriver driver) {
        super(driver);
        this.searchBox = new SearchBox(driver);
    }

    public void open() {
        this.driver.navigate().to("https://www.amazon.com");
        this.driver.manage().window().maximize();
    }

    public void findProduct(String nameProduct) {
        this.searchBox.findProduct(nameProduct);
    }
}
