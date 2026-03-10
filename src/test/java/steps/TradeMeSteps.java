package steps;


import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.TradeMePage;

public class TradeMeSteps {

    private TradeMePage tradeMePage = new TradeMePage();

    @Given("The user go to website TradeMe")
    public void theUserGoToWebsiteTradeMe() {
        tradeMePage.navigateTo("https://www.trademe.co.nz/a/");
    }


}
