package co.com.toyota.pageobjects;

import co.com.toyota.utils.Generics;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;


public class CarModelPage extends PageObject {
    Generics function;

    @FindBy(xpath = "(//div[@class='modelos_vehiculos row']/div)[2]")
    private WebElement carModels;


    public void clickModelCar(String option) {
       String modelList = "//div[@class='modelos_vehiculos row']/div";
       function.scrollToElement(carModels);
       function.selectOptions(option,modelList);
    }


}
