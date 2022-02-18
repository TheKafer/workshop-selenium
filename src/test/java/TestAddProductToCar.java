import dto.ProductDto;
import helpers.JsonHelper;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonHomePage;
import pages.AmazonListPage;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class TestAddProductToCar {
    private WebDriver driver;
    private AmazonHomePage amazonHomePage;
    private AmazonListPage amazonListPage;

    @Test(description="Add product to the car", dataProvider = "product")
    public void addProductToCar(String jsonName) {
        // Given
        ProductDto product = JsonHelper.readJson(jsonName);
        this.amazonHomePage.findProduct(product.getProductName());

        // When
        this.amazonListPage = new AmazonListPage(this.driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        this.amazonListPage.addFirstProductToCar();

        // Then
        assertTrue(this.amazonListPage.getPrice().contains(product.getPrice()));
    }

    @DataProvider(name = "product")
    public Object[][] getProduct() {
        return new Object [][] { {"product.json"} };
    }

    @BeforeSuite
    private void testSetup()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        this.amazonHomePage = new AmazonHomePage(this.driver);
        this.amazonHomePage.open();
    }
}
