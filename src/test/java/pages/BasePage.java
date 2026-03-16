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

        //Nos aseguramos que estén todas las opciones dentro
        WebElement select = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        wait.until(driver -> select.findElements(By.tagName("option")).size() > 1);

        //Ahora si devolvemos la Lista las opciones del Select
        return select.findElements(By.tagName("option"));
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void click(String locator) {
        getWebElement(locator).click();
    }

    public String getTextWebElement(String locator) {
        return getWebElement(locator).getText();
    }
    public List<String> getListOptionsSelect (String locator) {
        List<String> list = new ArrayList<>();

        for (WebElement element : getOptionsSelect(locator)) {
            list.add(element.getText());
        }

        return list;
    }

    public void selectOption(String locator, String option) {
        Select select = new Select(getWebElement(locator));
        select.selectByVisibleText(option);
    }









}
