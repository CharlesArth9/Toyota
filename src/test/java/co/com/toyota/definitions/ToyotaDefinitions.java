package co.com.toyota.definitions;

import co.com.toyota.steps.ToyotaSteps;
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

    @When("^try to choose a car model$")
    public void tryToChooseACarModel()  {
        toyota.selectCarBanner("5");
        toyota.chooseModelSpecification("HILUX 2.4L");
    }

    @Then("^check engine information$")
    public void checkEngineInformation()  {
        toyota.printInfoMotor();
    }

}
