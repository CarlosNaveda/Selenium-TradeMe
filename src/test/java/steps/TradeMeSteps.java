package steps;


import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.TradeMePage;

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

    @And("select {string} in the Make's dropbox")
    public void selectModelCarInTheMakeDropbox(String modelCar) {
        tradeMePage.selectModelCarInTheMakeDropbox(modelCar);
    }

    @And("do the search")
    public void doTheSearch() {
        tradeMePage.clickSearchButton();
    }

    @Then("the numbers of car's model available to search is {int}")
    public void getTheNumbersOfCarsModelAvailableToSearch(int numberOfCarsExpected) {
        int numberOfCarsAvailable = tradeMePage.getSizeListOfCarsModelAvailableToSearch();
        Assert.assertEquals(numberOfCarsAvailable,numberOfCarsExpected);

    }

    @Then("the number of results of this search is {int}")
    public void getTheNumberOfResultsOfTheSearch(int numberOfResultsExpected) {
        String textOfResultsCars = tradeMePage.getTextResultsOfCars();
        int numberOfResultsCars = Integer.parseInt(textOfResultsCars.replaceAll("[^0-9]", ""));
        Assert.assertEquals(numberOfResultsCars,numberOfResultsExpected);
    }



}
