package co.com.toyota.pageobjects;
import co.com.toyota.utils.Generics;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class SpecificationsPage extends PageObject {

    Generics function;

    @FindBy(xpath = "//li[@id='tab-especificaciones']")
    private WebElement btnSpecifications;

    @FindBy(xpath = "//div[contains(@role,'presentation')]/div[3]")
    private WebElementFacade btnMotor;

    public void clickSpecification() {
        function.scrollToElement(btnSpecifications);
        btnSpecifications.click();
    }

    public void clickMotor() {
        function.mouseClick(btnMotor);
    }

    public void getMotorInfo() {
        function.printText(btnMotor);
    }

}
