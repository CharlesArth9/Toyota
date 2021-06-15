package co.com.toyota.definitions;

import co.com.toyota.steps.ToyotaSteps;
import cucumber.api.DataTable;
import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ToyotaDefinitions {
    @Steps
    ToyotaSteps toyota;

    @Given("^Carlos enters the toyota\\.com\\.co website$")
    public void carlosEntersTheToyotaComCoWebsite()  {
        toyota.openWebsite();
    }


    @When("^try to choose a option for a car model in the page$")
    public void tryToChooseAOptionForACarModelInThePage(DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        String option = data.get(0).get("Options");
        String model = data.get(0).get("Models");

        toyota.selectCarBanner(option);
        toyota.chooseModelSpecification(model);
    }

    @Then("^check engine information$")
        public void checkEngineInformation()  {
        toyota.printInfoMotor();
    }


}
