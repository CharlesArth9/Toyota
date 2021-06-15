package co.com.toyota.steps;

import co.com.toyota.pageobjects.CarModelPage;
import co.com.toyota.pageobjects.OpenPage;
import co.com.toyota.pageobjects.HomePage;
import co.com.toyota.pageobjects.SpecificationsPage;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;


public class ToyotaSteps extends PageObject {
    protected OpenPage openPage;
    protected HomePage homePage;
    protected CarModelPage carModelPage;
    protected SpecificationsPage carSpecificationsPage;


    @Step
    public void openWebsite(){
        openPage.open();
    }

    public void selectCarBanner(String option) {
        homePage.acceptCookies();
        homePage.SelectBanner(option);
        homePage.clickCar();
    }

    public void chooseModelSpecification(String option) {
        carModelPage.clickModelCar(option);
        carSpecificationsPage.clickSpecification();
        carSpecificationsPage.clickMotor();
    }

    public void printInfoMotor() {
        carSpecificationsPage.getMotorInfo();
    }

}
