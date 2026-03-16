package pages;

import java.util.List;

public class TradeMePage extends BasePage {


    private String routerLinkMotor = "//a[@routerlink=\"/motors\"]";
    private String makeDropbox = "//select[@name='selectedMake']";
    private String searchButton ="//button[contains(.,'View listings')]";
    private String resultNumberSearch="//h3[contains(.,' Showing ')]";

    public TradeMePage() {
        super();
    }


    public void clickHeaderMotors(){
        click(routerLinkMotor);
    }

    public void clickHeaderMakeDropbox(){
        click(makeDropbox);
    }

    public int getSizeListOfCarsModelAvailableToSearch(){
        List<String> list = getListOptionsSelect(makeDropbox);
        return list.size();

    }

    public void clickSearchButton(){
        click(searchButton);
    }

    public void selectModelCarInTheMakeDropbox(String modelCar){
        selectOption(makeDropbox, modelCar);
    }

    public String getTextResultsOfCars() {
        return getTextWebElement(resultNumberSearch);
    }

}
