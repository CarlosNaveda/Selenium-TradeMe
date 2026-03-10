package steps;


import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import pages.TradeMePage;

import java.util.ArrayList;
import java.util.List;

public class TradeMeSteps {

    private TradeMePage tradeMePage = new TradeMePage();

    @Given("The user go to website TradeMe")
    public void theUserGoToWebsiteTradeMe() {
        tradeMePage.navigateTo("https://www.trademe.co.nz/a/");
    }

    @When("go to the header's option motor")
    public void goToTheHeadersOptionMotor() {
        tradeMePage.clickHeaderMotors();
    }

    @And("select the Make's dropbox")
    public void selectTheMakeDropbox() {
        tradeMePage.clickHeaderMakeDropbox();
    }

    @Then("get the numbers of car's model available to search")
    public void getTheNumbersOfCarsModelAvailableToSearch() {
        tradeMePage.getListOfCarsModelAvailableToSearch();
    }



}
