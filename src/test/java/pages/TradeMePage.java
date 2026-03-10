package pages;

import java.util.ArrayList;
import java.util.List;

public class TradeMePage extends BasePage {


    private String routerLinkMotor = "//a[@routerlink=\"/motors\"]";
    private String makeDropbox = "//select[@name='selectedMake']";

    public TradeMePage() {
        super();
    }


    public void clickHeaderMotors(){
        click(routerLinkMotor);
    }

    public void clickHeaderMakeDropbox(){
        click(makeDropbox);
    }

    public void getListOfCarsModelAvailableToSearch(){
        List<String> list = getListElements(makeDropbox);
        System.out.println("List size: " + list.size());
        System.out.println("List of cars: " + list);
    }



}
