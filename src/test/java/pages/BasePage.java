package pages;

import driverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    private WebElement getWebElement(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    private List<WebElement> getOptionsSelect(String locator) {

        List<WebElement> options;
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));
        Select select = new Select(getWebElement(locator));
        options = select.getOptions();

        return options;
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void click(String locator) {
        getWebElement(locator).click();
    }

    public List<String> getListElements (String locator) {
        List<String> list = new ArrayList<>();

        for (WebElement element : getOptionsSelect(locator)) {
            list.add(element.getText());
        }

        return list;
    }











}
